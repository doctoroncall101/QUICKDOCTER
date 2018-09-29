package com.example.user.quickdocter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginDoc extends AppCompatActivity {
    EditText email,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_doc);
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        email.clearFocus();
        password.clearFocus();
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),DocProfile.class);
                startActivity(intent);
            }
        });
    }
}
