package com.example.citylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {
TextView cityName;
Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        Intent show = getIntent();
        String name = show.getStringExtra("cityName");

        cityName =(TextView) findViewById(R.id.textName);
        back = (Button) findViewById(R.id.backButton);

        cityName.setText(name);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}