package com.example.kevin.tp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Sport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        Intent i = getIntent();

        TextView Name = (TextView) findViewById(R.id.textView8);

        Name.setText(i.getStringExtra("Nom")+" "+i.getStringExtra("Prenom"));
    }
}
