package com.example.autismawareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DailyRoutine extends AppCompatActivity {
    private Button home;
    private Button save;
    private EditText wake_time;
    private EditText breakfast;
    private EditText lunch;
    private EditText dinner;
    private EditText sleep;
    private static String str_wake;
    private static String str_breakfast;
    private static String str_lunch;
    private static String str_dinner;
    private static String sleep_time;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_routine);

        wake_time = (EditText) findViewById(R.id.waketime_Data);
        breakfast = (EditText) findViewById(R.id.breakfeat_data);
        lunch = (EditText) findViewById(R.id.lunch_data);
        dinner = (EditText) findViewById(R.id.Dinner_data);
        sleep = (EditText) findViewById(R.id.Sleeptime_data);
        home = (Button) findViewById(R.id.aaware_home);
        save = (Button) findViewById(R.id.save_routine);
        wake_time.setText(str_wake);
        breakfast.setText(str_breakfast);
        lunch.setText(str_lunch);
        dinner.setText(str_dinner);
        sleep.setText(sleep_time);




        home = (Button) findViewById(R.id.aaware_home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DailyRoutine.this, CategoryList.class));
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str_wake = wake_time.getText().toString();
                str_breakfast = dinner.getText().toString();
                str_lunch = lunch.getText().toString();
                str_dinner =  dinner.getText().toString();
                sleep_time = sleep.getText().toString();

                startActivity(new Intent(DailyRoutine.this, CategoryList.class));
            }
        });


    }
}
