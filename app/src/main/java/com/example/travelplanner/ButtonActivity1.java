package com.example.travelplanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonActivity1 extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);
        mShowCount = (TextView) findViewById(R.id.show_count);
            }

            public void countUp(View view) {
                mCount++;
                if (mShowCount != null) {
                    mShowCount.setText(Integer.toString(mCount));
                }
            }

            public void countDown(View view) {
                mCount--;
                if (mShowCount != null) {
                    mShowCount.setText(Integer.toString(mCount));

                }
            }
        }
