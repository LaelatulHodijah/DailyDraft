package com.project.mobile.dailydraft;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button logout;
    TextView tv;
    String st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        logout = findViewById(R.id.logout);
        tv = findViewById(R.id.textView);
        st = getIntent().getExtras().getString("key");
        tv.setText(st);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}