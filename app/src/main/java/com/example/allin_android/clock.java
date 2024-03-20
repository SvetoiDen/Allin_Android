package com.example.allin_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class clock extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clock);
    }

    public void Back(View v) {
        Intent swit = new Intent(clock.this, MainActivity.class);
        clock.this.startActivity(swit);
    }
}