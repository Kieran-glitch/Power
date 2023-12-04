package com.example.powertrackpro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class myItems extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_items);

        Intent intent = getIntent();

        if (intent != null) {
            ArrayList<Item> itemList = intent.getParcelableArrayListExtra("ITEM_LIST");
            ArrayList<String> displayList = new ArrayList<>();
            double totalWattHours = 0.0;

            if (itemList != null) {
                for (Item item : itemList) {
                    double itemTotal = item.getWatts() * item.getHours();
                    totalWattHours += itemTotal;
                    displayList.add(item.getName() + ": " + itemTotal + " Watt-Hours");
                }
            }

            displayList.add("Total: " + totalWattHours + " Watt-Hours");
            ListView listView = findViewById(R.id.listView);
            CustomListAdapter adapter = new CustomListAdapter(this, displayList);
            listView.setAdapter(adapter);
        }
    }
}
