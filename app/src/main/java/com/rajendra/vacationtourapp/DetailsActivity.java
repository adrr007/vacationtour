package com.rajendra.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Intent intent = getIntent();

        ((TextView) findViewById(R.id.textView6))
            .setText(intent.getStringExtra("placeName"));

        ((TextView) findViewById(R.id.textView15))
            .setText(intent.getStringExtra("cityName"));

        ((TextView) findViewById(R.id.textView11))
                .setText(intent.getStringExtra("price"));

        ((ImageView) findViewById(R.id.imageView3))
                .setImageResource(intent.getIntExtra("placeImage", -1));

        List<Integer> galleryImages = intent.getIntegerArrayListExtra("galleryImages");
        List<Integer> galleryImageViews = List.of(R.id.imageView8, R.id.imageView9, R.id.imageView10);
        for(int i = 0; i < galleryImageViews.size(); i++)
            ((ImageView) findViewById(galleryImageViews.get(i)))
                    .setImageResource(galleryImages.get(i % galleryImages.size()));
    }
}
