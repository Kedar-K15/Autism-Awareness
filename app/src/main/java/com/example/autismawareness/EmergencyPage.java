package com.example.autismawareness;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmergencyPage extends AppCompatActivity {
    private Button home;
    private EditText name_parent;
    private EditText num_parent;
    private EditText name_doctor;
    private EditText num_doctor;
    private Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_page);
        name_parent = (EditText) findViewById(R.id.parent_name_data);
        num_parent = (EditText) findViewById(R.id.parent_number_data);
        name_doctor = (EditText) findViewById(R.id.doctors_name_data);
        num_doctor = (EditText) findViewById(R.id.doctors_number_data);
        home = (Button) findViewById(R.id.aaware_home);
        save = (Button) findViewById(R.id.save_emergency);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmergencyPage.this, CategoryList.class));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = name_parent.getText().toString();
                String second = num_parent.getText().toString();
                String third = name_doctor.getText().toString();
                String fourth = num_doctor.getText().toString();
                SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(EmergencyPage.this);
                String str1 = prefs.getString("str1", first);
                name_parent.setText(str1);
                String str2 = prefs.getString("str2", second);
                num_parent.setText(str2);
                String str3 = prefs.getString("str3", third);
                name_doctor.setText(str3);
                String str4 = prefs.getString("str4", fourth);
                num_doctor.setText(str4);


            }
        });
    }
}
