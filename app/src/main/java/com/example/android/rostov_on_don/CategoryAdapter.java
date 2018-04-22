package com.example.android.rostov_on_don;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private final int CATEGORY_COUNT = 4;

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {

        Fragment CurrentFragment;

        switch (position) {
            case 0: CurrentFragment = new ShopsFragment(); break;
            case 1: CurrentFragment = new ShopsFragment(); break;
            case 2: CurrentFragment = new ShopsFragment(); break;
            case 3: CurrentFragment = new ShopsFragment(); break;

            default: CurrentFragment = new ShopsFragment(); break;
        }
/*
        if (position == 0) {
            return new ShopsFragment();
        } else if (position == 1) {
            return new ShopsFragment();
        } else if (position == 2) {
            return new ShopsFragment();
        } else {
            return new ShopsFragment();
        }
*/
        return CurrentFragment;
    }

    @Override
    public int getCount() {
        return CATEGORY_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.shops_name);
        } else if (position == 1) {
            return mContext.getString(R.string.shops_name);
        } else if (position == 2) {
            return mContext.getString(R.string.shops_name);
        } else {
            return mContext.getString(R.string.shops_name);
        }
    }
}
