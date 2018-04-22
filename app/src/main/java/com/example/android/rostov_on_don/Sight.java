package com.example.android.rostov_on_don;


import java.io.Serializable;

public class Sight implements Serializable{

    private int mSightNameId;
    private int mSightAddressId;
    private int mSightPhoneId;
    private int mSightImageId;




    public Sight(int sightNameId, int sightAddressId, int sightPhoneId,
                 int sightImageId) {

        mSightNameId = sightNameId;
        mSightAddressId = sightAddressId;
        mSightPhoneId = sightPhoneId;


        mSightImageId = sightImageId;
    }


    public int getSightNameId() {
        return mSightNameId;
    }

    public int getSightAddressId() {
        return mSightAddressId;
    }

    public int getSightPhoneId() {
        return mSightPhoneId;
    }

    public int getSightImageId() {
        return mSightImageId;
    }

}

