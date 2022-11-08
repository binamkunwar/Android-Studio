package com.suyashaa.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewExample extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_example);
        recyclerView=findViewById(R.id.recyclerview);
        String[] name={
                "Ram","Shyam","Hari","Gita","Sita"
        };
        String[] address={
                "Birtamode","Kathmandu","Pokhara","Birtamode","Kathmandu"
        };
        int[] image={
            R.drawable.ic_baseline_android_24,R.drawable.ic_baseline_android_24,R.drawable.ic_baseline_android_24,
                R.drawable.ic_baseline_android_24,R.drawable.ic_baseline_android_24
        };
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new RecyclerViewAdapter(this,name,address,image) ;
        recyclerView.setAdapter(adapter);
    }
}
