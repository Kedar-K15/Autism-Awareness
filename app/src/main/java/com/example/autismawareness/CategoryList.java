package com.example.autismawareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CategoryList extends AppCompatActivity {
    private Button health;
    private Button food;
    private Button routine;
    private Button log_out;
    private Button emergency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        food = (Button) findViewById(R.id.food);
        health = (Button) findViewById(R.id.health);
        emergency = (Button) findViewById(R.id.emergency);
        routine = (Button) findViewById(R.id.daily_routine);
        log_out = (Button) findViewById(R.id.log_out);


        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, FoodPanel.class));
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, HealthPanel.class));
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, EmergencyPage.class));
            }
        });
        routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, DailyRoutine.class));
            }
        });
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, OpeningScreen.class));
            }
        });
    }
}
