package com.wordpress.affdroid.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i = getIntent();

        txt = (TextView)findViewById(R.id.txtView);
        txt.setText(i.getStringExtra("key"));


    }
}
