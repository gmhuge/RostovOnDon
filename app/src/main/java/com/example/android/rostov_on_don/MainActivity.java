package com.example.android.rostov_on_don;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabWidget;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ArrayList<Sight> sights1 = new ArrayList<>();
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.working_hours1,
                    -1, -1, -1, R.string.type1, -1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.working_hours1,
                -1, -1, -1, R.string.type1, -1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.working_hours1,
                -1, -1, -1, R.string.type1, -1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.working_hours1,
                -1, -1, -1, R.string.type1, -1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.working_hours1,
                -1, -1, -1, R.string.type1, -1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.working_hours1,
                -1, -1, -1, R.string.type1, -1, R.drawable.mega1)));


        final ArrayList<Sight> sights2 = new ArrayList<>();
        sights2.add((new Sight(R.string.name2, R.string.address2, -1,
                R.string.buit2, R.string.dedicated2, -1, -1, -1, R.drawable.mega1)));
        sights2.add((new Sight(R.string.name2, R.string.address2, -1,
                R.string.buit2, R.string.dedicated2, -1, -1, -1, R.drawable.mega1)));
        sights2.add((new Sight(R.string.name2, R.string.address2, -1,
                R.string.buit2, R.string.dedicated2, -1, -1, -1, R.drawable.mega1)));

        final ArrayList<Sight> sights3 = new ArrayList<>();
        sights3.add((new Sight(R.string.name3, R.string.address3, -1,
                R.string.buit3, -1, R.string.confession3, -1, -1, R.drawable.mega1)));

        final ArrayList<Sight> sights4 = new ArrayList<>();
        sights4.add((new Sight(R.string.name4, R.string.address4, R.string.working_hours4,
                -1, -1, -1, -1, R.string.cuisine4, R.drawable.mega1)));


        final ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("Shops", sights1, R.color.category_family, R.color.category_family2));
        categories.add(new Category("Monuments", sights2, R.color.category_numbers, R.color.category_phrases));
        categories.add(new Category("Churches", sights3, R.color.tan_background, R.color.colorPrimary));
        categories.add(new Category("Restaurants", sights4, R.color.primary_color, R.color.colorAccent));

        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager(), categories);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.setSelectedTabIndicatorHeight(20);

/*
        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();
        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);
            int tabChildsCount = vgTab.getChildCount();
            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    ((TextView) tabViewChild).setTextSize(8);
                }
            }
        }

        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        for (int i = 0; i < vg.getChildCount(); i++) {
            final ViewGroup tab = (ViewGroup) vg.getChildAt(i);
            final TextView tabTextView = (TextView) tab.getChildAt(1); // Magic number
            tabTextView.setTextSize(8);

            tabTextView.setTextColor(getResources().getColor(R.color.category_family2));

        }
 */
    }
}
