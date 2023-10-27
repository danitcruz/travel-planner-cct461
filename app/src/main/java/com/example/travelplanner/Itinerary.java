package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Itinerary extends AppCompatActivity {

    TextView tvTime1, tvTime2, tvTime3, tvTime4, tvTime5, tvTime6, tvTime7, tvTime8, tvActivity1, tvActivity2, tvActivity3, tvActivity4, tvActivity5, tvActivity6, tvActivity7, tvActivity8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itinerary);
        tvTime1 = findViewById(R.id.tvTime1);
        tvActivity1 = findViewById(R.id.tvActivity1);
        tvTime2 = findViewById(R.id.tvTime2);
        tvActivity2 = findViewById(R.id.tvActivity2);
        tvTime3 = findViewById(R.id.tvTime3);
        tvActivity3 = findViewById(R.id.tvActivity3);
        tvTime4 = findViewById(R.id.tvTime4);
        tvActivity4 = findViewById(R.id.tvActivity4);
        tvTime5 = findViewById(R.id.tvTime5);
        tvActivity5 = findViewById(R.id.tvActivity5);
        tvTime6 = findViewById(R.id.tvTime6);
        tvActivity6 = findViewById(R.id.tvActivity6);
        tvTime7 = findViewById(R.id.tvTime7);
        tvActivity7 = findViewById(R.id.tvActivity7);
        tvTime8 = findViewById(R.id.tvTime8);
        tvActivity8 = findViewById(R.id.tvActivity8);
        Intent intent = getIntent();
        tvTime1.setText(intent.getStringExtra("time"));
        tvActivity1.setText(intent.getStringExtra("activity"));
        tvTime2.setText(intent.getStringExtra("time2"));
        tvActivity2.setText(intent.getStringExtra("activity2"));
        tvTime3.setText(intent.getStringExtra("time3"));
        tvActivity3.setText(intent.getStringExtra("activity3"));
        tvTime4.setText(intent.getStringExtra("time4"));
        tvActivity4.setText(intent.getStringExtra("activity4"));
        tvTime5.setText(intent.getStringExtra("time5"));
        tvActivity5.setText(intent.getStringExtra("activity5"));
        tvTime6.setText(intent.getStringExtra("time6"));
        tvActivity6.setText(intent.getStringExtra("activity6"));
        tvTime7.setText(intent.getStringExtra("time7"));
        tvActivity7.setText(intent.getStringExtra("activity7"));
        tvTime8.setText(intent.getStringExtra("time8"));
        tvActivity8.setText(intent.getStringExtra("activity8"));

    }
}