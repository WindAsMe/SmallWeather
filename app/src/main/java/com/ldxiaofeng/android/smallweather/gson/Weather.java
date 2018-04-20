package com.ldxiaofeng.android.smallweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 13178 on 2018-4-18.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}
