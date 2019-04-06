package com.example.autismawareness;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {
    EditText edt_title, edt_content;
    Button btn_post;
    RecyclerView recyclerView;
    FirebaseDatabase database;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edt_content = (EditText) findViewById(R.id.edit_content);
        edt_title = (EditText) findViewById(R.id.edit_title);
        btn_post = (Button) findViewById(R.id.btn_post);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        database = FirebaseDatabase.getInstance();
        reference = database.getReference("EDMT_FIREBASE");

        btn_post.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               postComment();
           }
        });

    }
    private void postComment() {
        String title = edt_title.getText().toString();
        String content = edt_content.getText().toString();
    }
}
