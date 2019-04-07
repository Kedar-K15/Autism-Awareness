package com.example.autismawareness;

import android.content.Intent;
import android.os.Bundle;
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
    private static String str_parent_1;
    private static String str_parent_2 ;
    private static String str_doc_1;
    private static String str_doc_2;
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

        name_parent.setText(str_parent_1);
        num_parent.setText(str_parent_2);
        name_doctor.setText(str_doc_1);
        num_doctor.setText(str_doc_2);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EmergencyPage.this, CategoryList.class));
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                str_parent_1 = name_parent.getText().toString();
                str_parent_2 = num_parent.getText().toString();
                str_doc_1 = name_doctor.getText().toString();
                str_doc_2 = num_doctor.getText().toString();
            }
        });
    }
}
