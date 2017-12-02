package com.elena.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Elena on 2017/12/2.
 */

public class Update {

    /**
     * loc : 2017-10-26 23:09
     * utc : 2017-10-26 15:09
     */

    @SerializedName("loc")
    public String localTime;

    @SerializedName("utc")
    public String utcTime;

}
