package com.example.abubakarzahid.gson_pasrsing_json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.app.ActionBarActivity;

public class MainActivity extends AppCompatActivity {
  private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // serialization means we can convert java object in to json
        // deserialization means convert json data in to java object..

        recyclerView = (RecyclerView)findViewById(R.id.gsonrecycle);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }
}
