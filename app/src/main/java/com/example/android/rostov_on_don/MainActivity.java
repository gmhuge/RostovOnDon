package com.example.android.rostov_on_don;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ArrayList<Sight> sights1 = new ArrayList<>();
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights1.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));

        final ArrayList<Sight> sights2 = new ArrayList<>();
        sights2.add((new Sight(R.string.name2, R.string.address2, R.string.phone2, R.drawable.mega1)));
        sights2.add((new Sight(R.string.name2, R.string.address2, R.string.phone2, R.drawable.mega1)));
        sights2.add((new Sight(R.string.name2, R.string.address2, R.string.phone2, R.drawable.mega1)));

        final ArrayList<Sight> sights3 = new ArrayList<>();
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));
        sights3.add((new Sight(R.string.name3, R.string.address3, R.string.phone3, R.drawable.mega1)));

        final ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("Shops", sights1, R.color.category_family, R.color.category_family2));
        categories.add(new Category("Monuments", sights2, R.color.category_numbers, R.color.category_phrases));
        categories.add(new Category("Markets", sights3, R.color.tan_background, R.color.colorPrimary));

        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpager);
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager(), categories);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }
}
