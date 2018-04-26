package com.example.android.rostov_on_don;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SightListFragment extends Fragment {
    private ArrayList<Sight> sights;
    public SightListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.sight_list, container, false);

        Bundle bundle = this.getArguments();

        sights = (ArrayList<Sight>) getArguments().getSerializable("sights");
        int colorResourceIdEven = bundle.getInt("color_even");
        int colorResourceIdNotEven = bundle.getInt("color_not_even");

        SightAdapter adapter = new SightAdapter(getActivity(), sights, colorResourceIdEven, colorResourceIdNotEven);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
