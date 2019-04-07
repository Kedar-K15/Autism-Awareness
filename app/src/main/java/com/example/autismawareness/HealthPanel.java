package com.example.autismawareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HealthPanel extends AppCompatActivity {
    private Button home;
    private Button save;
    private  EditText blood_type;
    private  EditText weight;
    private  EditText height;
    private static String str_blood_type;
    private static String str_weight;
    private static String str_height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_panel);

        blood_type = (EditText) findViewById(R.id.blood_type_data);
        weight = (EditText) findViewById(R.id.weight_data);
        height = (EditText) findViewById(R.id.height_data);
        home = (Button) findViewById(R.id.aaware_home);
        save = (Button) findViewById(R.id.save_emergency);
        blood_type.setText(str_blood_type);
        weight.setText(str_weight);
        height.setText(str_height);

        home = (Button) findViewById(R.id.aaware_home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthPanel.this, CategoryList.class));
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HealthPanel.this, CategoryList.class));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str_blood_type = blood_type.getText().toString();
                str_weight = weight.getText().toString();
                str_height = height.getText().toString();
                startActivity(new Intent(HealthPanel.this, CategoryList.class));
            }
        });
    }
}




