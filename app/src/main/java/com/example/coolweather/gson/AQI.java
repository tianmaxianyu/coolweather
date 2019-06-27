package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {
    public AQIcity city;
    public class AQIcity{
        public String aqi;

        public String pm25;
    }
}
