package com.example.allin_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but1 = findViewById(R.id.button);
    }

    public void clock_activ(View v) {
        Intent swit = new Intent(MainActivity.this, clock.class);
        MainActivity.this.startActivity(swit);
    }
}