package com.example.autismawareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CategoryList extends AppCompatActivity {
    private Button home;
    private Button health;
    private Button food;
    private Button routine;
    private Button log_out;
    private Button emergency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);
        home = (Button) findViewById(R.id.aaware_home);
        food = (Button) findViewById(R.id.food);
        health = (Button) findViewById(R.id.health);
        emergency = (Button) findViewById(R.id.emergency);
        routine = (Button) findViewById(R.id.daily_routine);
        log_out = (Button) findViewById(R.id.log_out);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, RegisterPanel.class));
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, RegisterPanel.class));
            }
        });
        health.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, RegisterPanel.class));
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, RegisterPanel.class));
            }
        });
        routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, RegisterPanel.class));
            }
        });
        log_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(CategoryList.this, RegisterPanel.class));
            }
        });
    }
}
