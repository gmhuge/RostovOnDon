package com.example.android.rostov_on_don;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShopsFragment extends Fragment {

    public ShopsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        final ArrayList<Sight> sights = new ArrayList<>();

        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));
        sights.add((new Sight(R.string.name1, R.string.address1, R.string.phone1, R.drawable.mega1)));

        SightAdapter adapter = new SightAdapter(getActivity(), sights, R.color.category_family, R.color.category_family2);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
