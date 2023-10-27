package com.example.travelplanner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity2 extends AppCompatActivity {

    EditText etTime1, etTime2, etTime3, etTime4, etTime5, etTime6, etTime7, etTime8, etActivity1, etActivity2, etActivity3, etActivity4, etActivity5, etActivity6, etActivity7, etActivity8;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        etTime1 = findViewById(R.id.etTime1);
        etTime2 = findViewById(R.id.etTime2);
        etTime3 = findViewById(R.id.etTime3);
        etTime4 = findViewById(R.id.etTime4);
        etTime5 = findViewById(R.id.etTime5);
        etTime6 = findViewById(R.id.etTime6);
        etTime7 = findViewById(R.id.etTime7);
        etTime8 = findViewById(R.id.etTime8);
        etActivity1 = findViewById(R.id.etActivity1);
        etActivity2 = findViewById(R.id.etActivity2);
        etActivity3 = findViewById(R.id.etActivity3);
        etActivity4 = findViewById(R.id.etActivity4);
        etActivity5 = findViewById(R.id.etActivity5);
        etActivity6 = findViewById(R.id.etActivity6);
        etActivity7 = findViewById(R.id.etActivity7);
        etActivity8 = findViewById(R.id.etActivity8);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = etTime1.getText().toString().trim();
                String activity = etActivity1.getText().toString().trim();
                String time2 = etTime2.getText().toString().trim();
                String activity2 = etActivity2.getText().toString().trim();
                String time3 = etTime3.getText().toString().trim();
                String activity3 = etActivity3.getText().toString().trim();
                String time4 = etTime4.getText().toString().trim();
                String activity4 = etActivity4.getText().toString().trim();
                String time5 = etTime5.getText().toString().trim();
                String activity5 = etActivity5.getText().toString().trim();
                String time6 = etTime6.getText().toString().trim();
                String activity6 = etActivity6.getText().toString().trim();
                String time7 = etTime7.getText().toString().trim();
                String activity7 = etActivity7.getText().toString().trim();
                String time8 = etTime8.getText().toString().trim();
                String activity8 = etActivity8.getText().toString().trim();
                if (time.equals("")) {
                    Toast.makeText(ButtonActivity2.this, "field is missing", Toast.LENGTH_SHORT).show();
                } else if (activity.equals("")) {
                    Toast.makeText(ButtonActivity2.this, "field is missing", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ButtonActivity2.this, Itinerary.class);
                    intent.putExtra("time", time);
                    intent.putExtra("activity", activity);
                    intent.putExtra("time2", time2);
                    intent.putExtra("activity2", activity2);
                    intent.putExtra("time3", time3);
                    intent.putExtra("activity3", activity3);
                    intent.putExtra("time4", time4);
                    intent.putExtra("activity4", activity4);
                    intent.putExtra("time5", time5);
                    intent.putExtra("activity5", activity5);
                    intent.putExtra("time6", time6);
                    intent.putExtra("activity6", activity6);
                    intent.putExtra("time7", time7);
                    intent.putExtra("activity7", activity7);
                    intent.putExtra("time8", time8);
                    intent.putExtra("activity8", activity8);
                    startActivity(intent);
                }
            }

    });
}

}