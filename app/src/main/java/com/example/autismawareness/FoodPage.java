package com.example.autismawareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FoodPage extends AppCompatActivity {
    private Button save;
    private Button home;
    private EditText daily_meal_plan;
    private EditText favorites;
    private EditText dislikes;
    private static String str_daily_meal_plan;
    private static String str_favorites;
    private static String str_dislikes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page);
        home = (Button) findViewById(R.id.aaware_home);
        save = (Button) findViewById(R.id.save_emergency);
        daily_meal_plan = (EditText) findViewById(R.id.Daily_Meal_plan_data);
        favorites = (EditText) findViewById(R.id.Favorites_data);
        dislikes = (EditText) findViewById(R.id.Dislike_data2);

        daily_meal_plan.setText(str_daily_meal_plan);
        favorites.setText(str_favorites);
        dislikes.setText(str_dislikes);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FoodPage.this, CategoryList.class));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str_daily_meal_plan = daily_meal_plan.getText().toString();
                str_favorites = favorites.getText().toString();
                str_dislikes = dislikes.getText().toString();
                startActivity(new Intent(FoodPage.this , CategoryList.class));
            }
        });



    }
}
