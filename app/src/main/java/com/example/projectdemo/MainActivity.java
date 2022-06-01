package com.example.projectdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> userList;
    Adaptar adaptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initRecycle();
    }

    private void initData() {
        userList = new ArrayList<>();

        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
        userList.add( new ModelClass(R.drawable.man, "Musfiqur Rahman", "10:00", "How are you?"));
    }

    private void initRecycle() {
        recyclerView = findViewById(R.id.recycleId);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adaptar = new Adaptar(userList);
        recyclerView.setAdapter(adaptar);
        adaptar.notifyDataSetChanged();
    }
}