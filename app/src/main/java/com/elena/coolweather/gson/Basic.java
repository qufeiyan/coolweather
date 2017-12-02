package com.elena.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Elena on 2017/12/2.
 */

public class Basic {

    /**
     * cid : CN101010100
     * location : 北京
     * parent_city : 北京
     * admin_area : 北京
     * cnty : 中国
     * lat : 39.90498734
     * lon : 116.40528870
     * tz : 8.0
     */
    @SerializedName("cid")
    public String WeatherId;
    public String location;
    public String parent_city;
    private String admin_area;

    @SerializedName("cnty")
    private String country;

    @SerializedName("lat")
    private String latitude;

    @SerializedName("lon")
    private String longitude;

    @SerializedName("tz")
    private String timeZone;

}
