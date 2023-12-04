package com.example.powertrackpro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class addItem extends AppCompatActivity {
    EditText type,watts,hours;
    Button add;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_item);
        type=findViewById(R.id.editTextText);
        watts=findViewById(R.id.editTextText2);
        hours=findViewById(R.id.editTextText3);
        add=findViewById(R.id.button4);
        String itemType= type.getText().toString();
        Double itemWatts=Double.parseDouble(watts.getText().toString());
        Double itemHours=Double.parseDouble(hours.getText().toString());
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Item> itemList = new ArrayList<>();

                Item newItem = new Item(itemType, itemWatts, itemHours);
                itemList.add(newItem);

// Start Activity2 with the updated list of items
                Intent intent = new Intent(addItem.this, myItems.class);
                intent.putParcelableArrayListExtra("ITEM_LIST", itemList);
                startActivity(intent);
            }
        });
    }
}
