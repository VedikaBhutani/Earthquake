package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by vedika on 14-07-2017.
 */

public class Earthquake {
    private Double mMagnitude;
    private String mDate;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;
    public Earthquake(double magnitude, String location, long timeInMilliseconds,String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }
    public Double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }
}
