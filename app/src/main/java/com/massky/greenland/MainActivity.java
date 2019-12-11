package com.massky.greenland;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.massky.greenland.base.BaseActivity;
import com.massky.greenland.bean.Environment;
import com.massky.greenland.bean.Weather;
import com.massky.greenland.utils.APIHelper;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.internal.Util;


import java.io.IOException;

public class MainActivity extends BaseActivity {

    private TextView tempture_txt;
    private TextView shidu_txt;
    private TextView air_txt;
    private TextView pm_txt;
    private Weather weather;
    private Environment environment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler.postDelayed(runnable_up_down, 1000 * 60 * 5);//1000 * 60 * 5
        init_view();
        if (!isNetworkAvailable(MainActivity.this)) {
            Toast.makeText(MainActivity.this, "网络不可用", Toast.LENGTH_LONG).show();
            return;
        }
        get_weather();
        get_environment();
    }

    Runnable runnable_up_down = new Runnable() {
        @Override
        public void run() {
            handler.postDelayed(this, 1000 * 60 * 5);
            if (!isNetworkAvailable(MainActivity.this)) {
                Toast.makeText(MainActivity.this, "网络不可用", Toast.LENGTH_LONG).show();
                return;
            }
            get_weather();
            get_environment();
        }
    };


    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    tempture_txt.setText(weather.getResult().get(0).getTemperature());
                    String humidity = weather.getResult().get(0).getHumidity();
                    String[] splits = humidity.split("：");
                    shidu_txt.setText(splits[1].trim());//湿度：86%
                    air_txt.setText(weather.getResult().get(0).getAirCondition());
                    break;
                case 1:
                    pm_txt.setText(environment.getResult().get(0).getPm25() + "");
                    break;
            }
        }
    };


    public void getDataByGet(final String type, String url) {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {
                if (response.isSuccessful()) {
                    String string = response.body().string();
                    Log.d("===============", string);
                    switch (type) {
                        case "weather":
                            weather = new Gson().fromJson(string, Weather.class);
                            handler.sendEmptyMessage(0);
                            break;
                        case "env":
                            environment = new Gson().fromJson(string, Environment.class);
                            handler.sendEmptyMessage(1);
                            break;
                    }
                }
            }
        });
    }


    public boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivity = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity == null) {
            return false;
        } else {
            NetworkInfo[] info = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++) {
                    if (info[i].getState() == NetworkInfo.State.CONNECTED
                            || info[i].getState() == NetworkInfo.State.CONNECTING) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    private void init_view() {
        tempture_txt = (TextView) findViewById(R.id.tempture_txt);
        shidu_txt = (TextView) findViewById(R.id.shidu_txt);
        air_txt = (TextView) findViewById(R.id.air_txt);
        pm_txt = (TextView) findViewById(R.id.pm_txt);

    }

    private void get_weather() {
        getDataByGet("weather", APIHelper.WEATHER);
    }

    private void get_environment() {//environment
        getDataByGet("env", APIHelper.ENVIRONMENT);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable_up_down);
    }
}


