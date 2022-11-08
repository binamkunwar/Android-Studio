package com.example.mvcrecycleview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewExample  extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.recycleview_example);
        recyclerView=findViewById(R.id.recyclerview);

        ArrayList<MyData> data=new ArrayList<>();
        data.add(new MyData("Ram","Biratnagar",R.drawable.ic_launcher_foreground));
        data.add(new MyData("BK","Sangla",R.drawable.ic_launcher_foreground));
        data.add(new MyData("MK","Mephi",R.drawable.ic_launcher_foreground));
        data.add(new MyData("RG","Banasthali",R.drawable.ic_launcher_foreground));

        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapter=new RecycleViewAdapter(this,data) ;
        recyclerView.setAdapter(adapter);


    }

}
