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

        ((TextView) findViewById(R.id.button))
            .setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://example.com"));
                    context.startActivity(i);
                }
            });

        ((TextView) findViewById(R.id.textView6))
            .setText(intent.getStringExtra("placeName"));

        ((TextView) findViewById(R.id.textView15))
            .setText(intent.getStringExtra("cityName"));

        ((TextView) findViewById(R.id.textView11))
                .setText(intent.getStringExtra("price"));

        List<Integer> images = intent.getIntegerArrayListExtra("images");

        ((ImageView) findViewById(R.id.imageView3))
                .setImageResource(images.get(0));

        List<Integer> galleryImageViews = List.of(R.id.imageView8, R.id.imageView9, R.id.imageView10);
        for(int i = 0; i < galleryImageViews.size(); i++)
            ((ImageView) findViewById(galleryImageViews.get(i)))
                    .setImageResource(images.get((i + 1) % images.size()));
    }
}
