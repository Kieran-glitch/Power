package com.example.powertrackpro;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final ArrayList<String> itemList;

    public CustomListAdapter(Context context, ArrayList<String> itemList) {
        super(context, R.layout.list_item, itemList);
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item, parent, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = rowView.findViewById(R.id.textView);
        textView.setText(itemList.get(position));

        return rowView;
    }
}

