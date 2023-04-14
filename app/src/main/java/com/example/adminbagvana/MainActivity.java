package com.example.adminbagvana;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CardView card_statistics, card_add, card_remove, card_edit, card_confirm, card_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_statistics = findViewById(R.id.card_statistics);
        card_add = findViewById(R.id.card_add);
        card_remove = findViewById(R.id.card_remove);
        card_edit = findViewById(R.id.card_edit);
        card_confirm = findViewById(R.id.card_confirm);
        card_settings = findViewById(R.id.card_settings);

        card_statistics.setOnClickListener(v -> {
            // code in here
            Intent myIntent = new Intent(MainActivity.this, StatisticsActivity.class);
//                myIntent.putExtras(myBundle);
            startActivity(myIntent);
        });

        card_add.setOnClickListener(v -> {
            // code in here
        });

        card_remove.setOnClickListener(v -> {
            // code in here
        });

        card_edit.setOnClickListener(v -> {
            // code in here
        });

        card_confirm.setOnClickListener(v -> {
            // code in here
        });

        card_settings.setOnClickListener(v -> {
            // code in here
        });


    }
}