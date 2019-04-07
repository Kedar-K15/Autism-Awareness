package com.example.autismawareness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.HashMap;


public class Login extends AppCompatActivity {
    private Button login;
    private Button register;
    private HashMap<String, String> login_information;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    private boolean isValid(String username, String password) {
        if(login_information.containsKey(username)) {
            if(login_information.get(username) == password) {
                return true;
            }
        }
        return false;
    }
    private void addPerson(String username, String password) {
        login_information.put(username, password);
    }
}

