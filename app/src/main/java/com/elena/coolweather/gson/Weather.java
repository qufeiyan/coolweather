package com.elena.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Elena on 2017/12/2.
 */

public class Weather {
    public String status;
    public Basic basic;
    public Now now;
    public Update update;

    public List<Lifestyle> lifestyleList;

    @SerializedName("daily_forecast")
    public List<DailyForecast> dailyForecastList;
}
