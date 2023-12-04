package com.example.powertrackpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class home extends AppCompatActivity {
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn1=findViewById(R.id.button2);
        btn2=findViewById(R.id.button3);
        btn1.setOnClickListener(v -> {
            Intent intent=new Intent(home.this,addItem.class);
            startActivity(intent);
        });
        btn2.setOnClickListener(v -> {
            Intent intent =new Intent(home.this, myItems.class);
            startActivity(intent);
        });
    }
}