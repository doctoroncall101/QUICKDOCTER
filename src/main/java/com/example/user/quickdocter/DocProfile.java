package com.example.user.quickdocter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DocProfile extends AppCompatActivity {
    ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_profile);
        profile=(ImageView)findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplication(),DocEdit.class);
                startActivity(intent);
            }
        });
    }
}
