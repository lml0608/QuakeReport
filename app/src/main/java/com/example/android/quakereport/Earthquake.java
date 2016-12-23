package com.example.android.quakereport;

/**
 * Created by zengzhi on 2016/12/22.
 */

public class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake(double mMagnitude, String mLocation, long mTimeInMilliseconds , String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds =  mTimeInMilliseconds;
        this.mUrl = url;
    }



    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmUrl() {
        return mUrl;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
