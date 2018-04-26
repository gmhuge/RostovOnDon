package com.example.android.rostov_on_don;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import android.widget.TabWidget;
import android.widget.TextView;

import java.util.ArrayList;

public class CategoryAdapter extends FragmentPagerAdapter {



    private Context mContext;
    private ArrayList<Category> mCategories;
    private CharSequence categoryName;

    public CategoryAdapter(Context context, FragmentManager fm, ArrayList<Category> categories) {
        super(fm);
        mContext = context;
        mCategories = categories;


        /*
        final TabWidget tabWidget = get;
        for (int i = 0; i < tabWidget.getChildCount(); i++) {
            final ViewGroup tab = (ViewGroup) tabWidget.getChildAt(i);
            final TextView tabTextView = (TextView) tab.getChildAt(1); // Magic number
            tabTextView.setTextSize(8);
 */
    }

    @Override
    public Fragment getItem(int position) {

        ArrayList<Sight> sights = new ArrayList<>();

        Category currentCategory = mCategories.get(position);

        sights = currentCategory.getSights();
        categoryName = currentCategory.getCategoryName();

        Fragment CurrentFragment;

        Bundle bundle = new Bundle();
        bundle.putSerializable("sights", sights);

        bundle.putInt("color_even", currentCategory.getColorResourceIdEven());
        bundle.putInt("color_not_even", currentCategory.getColorResourceIdNotEven());

        CurrentFragment = new SightListFragment();

        CurrentFragment.setArguments(bundle);
        return CurrentFragment;
    }

    @Override
    public int getCount() {

        return mCategories.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {


        Category currentCategory = mCategories.get(position);
        return currentCategory.getCategoryName();
    }
}
