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
        sights1.add((new Sight(R.string.shop_name1, R.string.shop_address1, R.string.shop_working_hours1,
                -1, -1, -1, R.string.shop_type1, -1, R.drawable.shop1)));
        sights1.add((new Sight(R.string.shop_name2, R.string.shop_address2, R.string.shop_working_hours2,
                -1, -1, -1, R.string.shop_type2, -1, R.drawable.shop2)));
        sights1.add((new Sight(R.string.shop_name3, R.string.shop_address3, R.string.shop_working_hours3,
                -1, -1, -1, R.string.shop_type3, -1, R.drawable.shop3)));
        sights1.add((new Sight(R.string.shop_name4, R.string.shop_address4, R.string.shop_working_hours4,
                -1, -1, -1, R.string.shop_type4, -1, R.drawable.shop4)));
        sights1.add((new Sight(R.string.shop_name5, R.string.shop_address5, R.string.shop_working_hours5,
                -1, -1, -1, R.string.shop_type5, -1, R.drawable.shop5)));

        final ArrayList<Sight> sights2 = new ArrayList<>();
        sights2.add((new Sight(R.string.monumnet_name1, R.string.monument_address1, -1,
                R.string.monument_buit1, R.string.monument_dedicated1, -1, -1, -1, R.drawable.monument1)));
        sights2.add((new Sight(R.string.monumnet_name2, R.string.monument_address2, -1,
                R.string.monument_buit2, R.string.monument_dedicated2, -1, -1, -1, R.drawable.monument2)));
        sights2.add((new Sight(R.string.monumnet_name3, R.string.monument_address3, -1,
                R.string.monument_buit3, R.string.monument_dedicated3, -1, -1, -1, R.drawable.monument3)));
        sights2.add((new Sight(R.string.monumnet_name4, R.string.monument_address4, -1,
                R.string.monument_buit4, R.string.monument_dedicated4, -1, -1, -1, R.drawable.monument4)));
        sights2.add((new Sight(R.string.monumnet_name5, R.string.monument_address5, -1,
                R.string.monument_buit5, R.string.monument_dedicated5, -1, -1, -1, R.drawable.monument5)));

        final ArrayList<Sight> sights3 = new ArrayList<>();
        sights3.add((new Sight(R.string.church_name1, R.string.church_address1, -1,
                R.string.church_buit1, -1, R.string.church_confession1, -1, -1, R.drawable.church1)));
        sights3.add((new Sight(R.string.church_name2, R.string.church_address2, -1,
                R.string.church_buit2, -1, R.string.church_confession2, -1, -1, R.drawable.church2)));
        sights3.add((new Sight(R.string.church_name3, R.string.church_address3, -1,
                R.string.church_buit3, -1, R.string.church_confession3, -1, -1, R.drawable.church3)));
        sights3.add((new Sight(R.string.church_name4, R.string.church_address4, -1,
                R.string.church_buit4, -1, R.string.church_confession4, -1, -1, R.drawable.church4)));
        sights3.add((new Sight(R.string.church_name5, R.string.church_address5, -1,
                R.string.church_buit5, -1, R.string.church_confession5, -1, -1, R.drawable.church5)));

        final ArrayList<Sight> sights4 = new ArrayList<>();
        sights4.add((new Sight(R.string.restaurant_name1, R.string.restaurant_address1, R.string.restaurant_working_hours1,
                -1, -1, -1, -1, R.string.restaurant_cuisine1, R.drawable.restaurant1)));
        sights4.add((new Sight(R.string.restaurant_name2, R.string.restaurant_address2, R.string.restaurant_working_hours2,
                -1, -1, -1, -1, R.string.restaurant_cuisine2, R.drawable.restaurant2)));
        sights4.add((new Sight(R.string.restaurant_name3, R.string.restaurant_address3, R.string.restaurant_working_hours3,
                -1, -1, -1, -1, R.string.restaurant_cuisine3, R.drawable.restaurant3)));
        sights4.add((new Sight(R.string.restaurant_name4, R.string.restaurant_address4, R.string.restaurant_working_hours4,
                -1, -1, -1, -1, R.string.restaurant_cuisine4, R.drawable.restaurant4)));
        sights4.add((new Sight(R.string.restaurant_name5, R.string.restaurant_address5, R.string.restaurant_working_hours5,
                -1, -1, -1, -1, R.string.restaurant_cuisine5, R.drawable.restaurant5)));


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

    }
}
