package com.example.allin_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class app_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);
    }

    public void Back(View v) {
        Intent swit = new Intent(app_list.this, MainActivity.class);
        app_list.this.startActivity(swit);
    }
}