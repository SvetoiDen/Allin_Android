package com.example.allin_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class dnevnik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dnevnik);
    }

    public void Back(View v) {
        Intent swit = new Intent(dnevnik.this, MainActivity.class);
        dnevnik.this.startActivity(swit);
    }
}