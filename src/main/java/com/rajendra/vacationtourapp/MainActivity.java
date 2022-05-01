package com.rajendra.vacationtourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rajendra.vacationtourapp.adapter.RecentsAdapter;
import com.rajendra.vacationtourapp.adapter.TopPlacesAdapter;
import com.rajendra.vacationtourapp.model.RecentsData;
import com.rajendra.vacationtourapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Now here we will add some dummy data in our model class

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("Gateway of India","Mumbai","Free", R.drawable.goi4, List.of(R.drawable.goi1, R.drawable.goi2, R.drawable.goi3)));
        recentsDataList.add(new RecentsData("Marine Drive","Mumbai","Free",R.drawable.md2, List.of(R.drawable.md1, R.drawable.md3)));
        recentsDataList.add(new RecentsData("Victoria Memorial","Kolkata","$15",R.drawable.vm5, List.of(R.drawable.vm2, R.drawable.vm3, R.drawable.vm4)));
        recentsDataList.add(new RecentsData("Howrah Bridge","Kolkata","Free",R.drawable.hb3, List.of(R.drawable.hb1, R.drawable.hb2, R.drawable.hb4)));
        recentsDataList.add(new RecentsData("Red Fort","Delhi","$15",R.drawable.rf1, List.of(R.drawable.rf2, R.drawable.rf3, R.drawable.rf4)));
        recentsDataList.add(new RecentsData("India Gate","Delhi","Free",R.drawable.ig1, List.of(R.drawable.ig2, R.drawable.ig3, R.drawable.ig4)));
        recentsDataList.add(new RecentsData("Vivekananda House","Chennai","$5",R.drawable.vh1, List.of(R.drawable.vh2, R.drawable.vh3)));
        recentsDataList.add(new RecentsData("Marundeeshwarar Temple","Chennai","Free",R.drawable.mt3, List.of(R.drawable.mt1, R.drawable.mt2)));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Gateway of India","Mumbai","Free", R.drawable.goi4));
        topPlacesDataList.add(new TopPlacesData("Marine Drive","Mumbai","Free",R.drawable.md2));
        topPlacesDataList.add(new TopPlacesData("Victoria Memorial","Kolkata","$15",R.drawable.vm5));
        topPlacesDataList.add(new TopPlacesData("Howrah Bridge","Kolkata","Free",R.drawable.hb3));
        topPlacesDataList.add(new TopPlacesData("Red Fort","Delhi","$15",R.drawable.rf1));
        topPlacesDataList.add(new TopPlacesData("India Gate","Delhi","Free",R.drawable.ig1));
        topPlacesDataList.add(new TopPlacesData("Vivekananda House","Chennai","$5",R.drawable.vh1));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private  void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recent_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private  void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }

}
