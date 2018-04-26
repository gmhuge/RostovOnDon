package com.example.android.rostov_on_don;


import java.io.Serializable;

public class Sight implements Serializable{

    private int mSightNameId;
    private int mSightAddressId;
    private int mSightWorkHoursId;
    private int mSightBuiltId;

    private int mSighDedicatedId;
    private int mSightConfessionId;
    private int mSightTypeId;
    private int mSightCuisineId;


    private int mSightImageId;

    //private int m



    public Sight(int sightNameId, int sightAddressId, int sightWorkHoursId,
                 int sightBuiltId, int sightDedicatedId, int sightConfessionId,
                 int sightTypeId, int sightCuisineId, int sightImageId) {

        mSightNameId = sightNameId;
        mSightAddressId = sightAddressId;
        mSightWorkHoursId = sightWorkHoursId;
        mSightBuiltId = sightBuiltId;
        mSighDedicatedId = sightDedicatedId;
        mSightConfessionId = sightConfessionId;
        mSightTypeId = sightTypeId;
        mSightCuisineId = sightCuisineId;

        mSightImageId = sightImageId;
    }


    public int getSightNameId() {
        return mSightNameId;
    }

    public int getSightAddressId() {
        return mSightAddressId;
    }

    public int getSightWorkHoursId() {
        return mSightWorkHoursId;
    }

    public int getSightBuiltId() {
        return mSightBuiltId;
    }

    public int getSightDedicatedId() {return mSighDedicatedId;}

    public int getSightConfessionId() {
        return mSightConfessionId;
    }

    public int getSightTypeId() {
        return mSightTypeId;
    }

    public int getSightCuisineId() {
        return mSightCuisineId;
    }

    public int getSightImageId() {
        return mSightImageId;
    }

}


