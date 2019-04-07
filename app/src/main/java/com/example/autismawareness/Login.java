package com.example.autismawareness;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;


public class Login extends AppCompatActivity {
    private Button login;
    private Button register;
    private EditText username;
    private EditText password;
    private HashMap<String, String> login_information = new HashMap<>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.print("Hi");
        setContentView(R.layout.activity_login);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(User x : User.getInformation()) {
                    if (x.getUsername().equals(username.getText().toString()) && x.getPassword().equals(password.getText().toString())) {
                        startActivity(new Intent(Login.this, CategoryList.class));
                        break;
                    } else {
                        Toast.makeText(Login.this, "Incorrect password and/or username", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, RegisterPanel.class));
            }
        });
    }
}

