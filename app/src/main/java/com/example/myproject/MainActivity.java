package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    private final String JSON_URL = "https://mobprog.webug.se/json-api/getdataasjson.php?type=b21emmbj";
    private List<Svamp> listofSvampar;
    private Myadapter adapter;
    RecyclerView recyclerView;

    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listofSvampar = new ArrayList<Svamp>();
        adapter = new Myadapter();

        recyclerView = findViewById(R.id.myRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        new JsonTask(this).execute(JSON_URL);

        button = findViewById(R.id.about_button);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);

        });
    }

    @Override
    public void onPostExecute(String json) {

        Log.d("!", json);
        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Svamp>>() {}.getType();
        listofSvampar = gson.fromJson(json, type);
        adapter.setSvamps(listofSvampar);
        adapter.notifyDataSetChanged();
    }
}