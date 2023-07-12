package com.rajendra.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TopPlacesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iteniary);
        Intent intent = getIntent();

        ((TextView) findViewById(R.id.button))
            .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSf3IyN6hg2o6McR3XVViERoEFJ5QB96S5iykrjDk5fHYcdo-Q/viewform"));
                    startActivity(i);
                }
            });

        ((TextView) findViewById(R.id.textView27))
            .setText(intent.getStringExtra("itinerary"));

        ((TextView) findViewById(R.id.textView20))
            .setText(intent.getStringExtra("placeName"));

        ((TextView) findViewById(R.id.textView23))
                .setText(intent.getStringExtra("price"));

        ((TextView) findViewById(R.id.textView25))
                .setText(intent.getStringExtra("about"));

        ((ImageView) findViewById(R.id.imageView15))
                .setImageResource(intent.getIntExtra("image",-1));
    }
}
