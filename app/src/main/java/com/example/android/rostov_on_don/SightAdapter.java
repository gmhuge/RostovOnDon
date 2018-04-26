package com.example.android.rostov_on_don;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class SightAdapter extends ArrayAdapter<Sight> {

    private int mColorResourceIdEven;
    private int mColorResourceIdNotEven;

    public SightAdapter(Context context, ArrayList<Sight> words, int colorResourceIdEven, int colorResourceIdNotEven) {
        super(context, 0, words);
        mColorResourceIdEven = colorResourceIdEven;
        mColorResourceIdNotEven = colorResourceIdNotEven;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        int mColorResourceId;

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        if (position % 2 == 0) {
            mColorResourceId = mColorResourceIdEven;
        } else {
            mColorResourceId = mColorResourceIdNotEven;
        }

        Sight currentSight = getItem(position);


        TextView NameTextView = listItemView.findViewById(R.id.name_text_view);
        NameTextView.setText(currentSight.getSightNameId());

  /*

        TextView AddressTextView = listItemView.findViewById(R.id.address_text_view);
        AddressTextView.setText(currentSight.getSightAddressId());

        TextView WorkHoursTextView = listItemView.findViewById(R.id.work_hours_text_view);
        WorkHoursTextView.setText(currentSight.getSightWorkHoursId());


    */



        setText(listItemView, R.id.address_text_view, currentSight.getSightAddressId(), R.id.address_row);
        setText(listItemView, R.id.work_hours_text_view, currentSight.getSightWorkHoursId(), R.id.work_hours_row);
        setText(listItemView, R.id.was_built_text_view, currentSight.getSightBuiltId(), R.id.was_built_row);
        setText(listItemView, R.id.dedicated_text_view, currentSight.getSightDedicatedId(), R.id.dedicated_row);
        setText(listItemView, R.id.confession_text_view, currentSight.getSightConfessionId(), R.id.confession_row);
        setText(listItemView, R.id.type_text_view, currentSight.getSightTypeId(), R.id.type_row);
        setText(listItemView, R.id.cuisine_text_view, currentSight.getSightCuisineId(), R.id.cuisine_row);


        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentSight.getSightImageId());
        imageView.setVisibility(View.VISIBLE);

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

    private void setText (View view, int textViewId, int textId, int tableRowId) {
        TableRow raw = view.findViewById(tableRowId);
        if (textId < 0) {
            raw.setVisibility(View.GONE);
        }
        else {
            TextView text = view.findViewById(textViewId);
            text.setText(textId);
            raw.setVisibility(View.VISIBLE);

        }

    }
}