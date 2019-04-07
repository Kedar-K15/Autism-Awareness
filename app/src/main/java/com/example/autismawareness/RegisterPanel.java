package com.example.autismawareness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterPanel extends AppCompatActivity {
    private EditText name;
    private EditText email;
    private EditText username;
    private EditText password;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpanel);
        name = (EditText) findViewById(R.id.name_create);
        email = (EditText) findViewById(R.id.email_create);
        username = (EditText) findViewById(R.id.username_create);
        password = (EditText) findViewById(R.id.password_create);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                User.addUser(new User(name.getText().toString(), username.getText().toString(), password.getText().toString()));
            }

        });

    }
}
