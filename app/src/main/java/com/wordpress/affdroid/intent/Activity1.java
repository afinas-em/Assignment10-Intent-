package com.wordpress.affdroid.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        b = (Button)findViewById(R.id.btn);
        e = (EditText)findViewById(R.id.edt_txt);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Activity2.class);
                i.putExtra("key",e.getText().toString());
                startActivity(i);
            }
        });

    }
}
