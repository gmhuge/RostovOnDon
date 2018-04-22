package com.example.android.rostov_on_don;

import java.io.Serializable;
import java.util.ArrayList;

public class Category implements Serializable{

    private CharSequence mCategoryName;
    private ArrayList<Sight> mSights;
    private int mColorResourceIdEven;
    private int mColorResourceIdNotEven;

    public Category (CharSequence categoryNameId, ArrayList<Sight> sights, int colorResourceIdEven, int colorResourceIdNotEven) {
        mCategoryName = categoryNameId;
        mSights = sights;
        mColorResourceIdEven = colorResourceIdEven;
        mColorResourceIdNotEven = colorResourceIdNotEven;
    }

    public CharSequence getCategoryName() {
        return mCategoryName;
    }

    public ArrayList<Sight> getSights() {
        return mSights;
    }

    public int getColorResourceIdEven() {
        return mColorResourceIdEven;
    }

    public int getColorResourceIdNotEven() {
        return mColorResourceIdNotEven;
    }

}
