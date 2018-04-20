package com.ldxiaofeng.android.smallweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 13178 on 2018-4-18.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
