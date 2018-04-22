package com.example.android.rostov_on_don;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class CategoryAdapter extends FragmentPagerAdapter {

//    private final int CATEGORY_COUNT = 4;

    private Context mContext;
    private ArrayList<Category> mCategories;
    private CharSequence categoryName;

    public CategoryAdapter(Context context, FragmentManager fm, ArrayList<Category> categories) {
        super(fm);
        mContext = context;
        mCategories = categories;

    }

    @Override
    public Fragment getItem(int position) {

        ArrayList<Sight> sights = new ArrayList<>();

        Category currentCategory = mCategories.get(position);

        sights = currentCategory.getSights();
        categoryName = currentCategory.getCategoryName();

    /*
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
    */
        Fragment CurrentFragment;

        Bundle bundle = new Bundle();
        bundle.putSerializable("sights", sights);

        bundle.putInt("color_even", currentCategory.getColorResourceIdEven());
        bundle.putInt("color_not_even", currentCategory.getColorResourceIdNotEven());

/*

        switch (position) {
            case 0: CurrentFragment = new ShopsFragment(); break;
            case 1: CurrentFragment = new ShopsFragment(); break;
            case 2: CurrentFragment = new ShopsFragment(); break;
            case 3: CurrentFragment = new ShopsFragment(); break;

            default: CurrentFragment = new ShopsFragment(); break;
        }
*/

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

        CurrentFragment = new SightListFragment();

        CurrentFragment.setArguments(bundle);
        return CurrentFragment;
    }

    @Override
    public int getCount() {


        //return CATEGORY_COUNT;
        return mCategories.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        /*

        if (position == 0) {
            return mContext.getString(R.string.shops_name);
        } else if (position == 1) {
            return mContext.getString(R.string.shops_name);
        } else if (position == 2) {
            return mContext.getString(R.string.shops_name);
        } else {
            return mContext.getString(R.string.shops_name);
        }
    */
        //  return categoryName;

        Category currentCategory = mCategories.get(position);
        return currentCategory.getCategoryName();
    }
}
