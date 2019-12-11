package com.massky.greenland.bean;

import java.util.List;

public class Environment {

    /**
     * msg : success
     * result : [{"aqi":80,"city":"长沙","district":"长沙","fetureData":[],"hourData":[{"aqi":80,"dateTime":"2019-12-10 14:00:00"},{"aqi":87,"dateTime":"2019-12-10 13:00:00"},{"aqi":90,"dateTime":"2019-12-10 12:00:00"},{"aqi":88,"dateTime":"2019-12-10 11:00:00"},{"aqi":88,"dateTime":"2019-12-10 10:00:00"},{"aqi":89,"dateTime":"2019-12-10 09:00:00"},{"aqi":90,"dateTime":"2019-12-10 08:00:00"},{"aqi":90,"dateTime":"2019-12-10 07:00:00"},{"aqi":97,"dateTime":"2019-12-10 06:00:00"},{"aqi":97,"dateTime":"2019-12-10 05:00:00"},{"aqi":102,"dateTime":"2019-12-10 04:00:00"},{"aqi":109,"dateTime":"2019-12-10 03:00:00"},{"aqi":113,"dateTime":"2019-12-10 02:00:00"},{"aqi":110,"dateTime":"2019-12-10 01:00:00"},{"aqi":114,"dateTime":"2019-12-10 00:00:00"},{"aqi":107,"dateTime":"2019-12-09 23:00:00"},{"aqi":107,"dateTime":"2019-12-09 22:00:00"},{"aqi":108,"dateTime":"2019-12-09 21:00:00"},{"aqi":102,"dateTime":"2019-12-09 20:00:00"},{"aqi":93,"dateTime":"2019-12-09 19:00:00"},{"aqi":83,"dateTime":"2019-12-09 18:00:00"},{"aqi":75,"dateTime":"2019-12-09 17:00:00"},{"aqi":75,"dateTime":"2019-12-09 16:00:00"},{"aqi":78,"dateTime":"2019-12-09 15:00:00"}],"no2":46,"pm10":76,"pm25":59,"province":"湖南","quality":"良","so2":21,"updateTime":"2019-12-10 14:00:00"}]
     * retCode : 200
     */

    private String msg;
    private String retCode;
    private List<ResultBean> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * aqi : 80
         * city : 长沙
         * district : 长沙
         * fetureData : []
         * hourData : [{"aqi":80,"dateTime":"2019-12-10 14:00:00"},{"aqi":87,"dateTime":"2019-12-10 13:00:00"},{"aqi":90,"dateTime":"2019-12-10 12:00:00"},{"aqi":88,"dateTime":"2019-12-10 11:00:00"},{"aqi":88,"dateTime":"2019-12-10 10:00:00"},{"aqi":89,"dateTime":"2019-12-10 09:00:00"},{"aqi":90,"dateTime":"2019-12-10 08:00:00"},{"aqi":90,"dateTime":"2019-12-10 07:00:00"},{"aqi":97,"dateTime":"2019-12-10 06:00:00"},{"aqi":97,"dateTime":"2019-12-10 05:00:00"},{"aqi":102,"dateTime":"2019-12-10 04:00:00"},{"aqi":109,"dateTime":"2019-12-10 03:00:00"},{"aqi":113,"dateTime":"2019-12-10 02:00:00"},{"aqi":110,"dateTime":"2019-12-10 01:00:00"},{"aqi":114,"dateTime":"2019-12-10 00:00:00"},{"aqi":107,"dateTime":"2019-12-09 23:00:00"},{"aqi":107,"dateTime":"2019-12-09 22:00:00"},{"aqi":108,"dateTime":"2019-12-09 21:00:00"},{"aqi":102,"dateTime":"2019-12-09 20:00:00"},{"aqi":93,"dateTime":"2019-12-09 19:00:00"},{"aqi":83,"dateTime":"2019-12-09 18:00:00"},{"aqi":75,"dateTime":"2019-12-09 17:00:00"},{"aqi":75,"dateTime":"2019-12-09 16:00:00"},{"aqi":78,"dateTime":"2019-12-09 15:00:00"}]
         * no2 : 46
         * pm10 : 76
         * pm25 : 59
         * province : 湖南
         * quality : 良
         * so2 : 21
         * updateTime : 2019-12-10 14:00:00
         */

        private int aqi;
        private String city;
        private String district;
        private int no2;
        private int pm10;
        private int pm25;
        private String province;
        private String quality;
        private int so2;
        private String updateTime;
        private List<?> fetureData;
        private List<HourDataBean> hourData;

        public int getAqi() {
            return aqi;
        }

        public void setAqi(int aqi) {
            this.aqi = aqi;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public int getNo2() {
            return no2;
        }

        public void setNo2(int no2) {
            this.no2 = no2;
        }

        public int getPm10() {
            return pm10;
        }

        public void setPm10(int pm10) {
            this.pm10 = pm10;
        }

        public int getPm25() {
            return pm25;
        }

        public void setPm25(int pm25) {
            this.pm25 = pm25;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getQuality() {
            return quality;
        }

        public void setQuality(String quality) {
            this.quality = quality;
        }

        public int getSo2() {
            return so2;
        }

        public void setSo2(int so2) {
            this.so2 = so2;
        }

        public String getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
        }

        public List<?> getFetureData() {
            return fetureData;
        }

        public void setFetureData(List<?> fetureData) {
            this.fetureData = fetureData;
        }

        public List<HourDataBean> getHourData() {
            return hourData;
        }

        public void setHourData(List<HourDataBean> hourData) {
            this.hourData = hourData;
        }

        public static class HourDataBean {
            /**
             * aqi : 80
             * dateTime : 2019-12-10 14:00:00
             */

            private int aqi;
            private String dateTime;

            public int getAqi() {
                return aqi;
            }

            public void setAqi(int aqi) {
                this.aqi = aqi;
            }

            public String getDateTime() {
                return dateTime;
            }

            public void setDateTime(String dateTime) {
                this.dateTime = dateTime;
            }
        }
    }
}
