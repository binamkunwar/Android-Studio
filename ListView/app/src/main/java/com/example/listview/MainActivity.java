package com.example.listview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity  extends AppCompatActivity {
    ListView listview;
    TextView textView;
    String[] listItem;
    private Object AdapterView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview=(ListView) findViewById(R.id.listView);
        textView=(TextView) findViewById(R.id.textView);
        listItem=getResources().getStringArray(R.array.array_technology);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> adapterView, View view, int i, long l) {

                int position = 0;
                String value=adapter.getItem(position);

                Toast.makeText(getApplicationContext(),value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}



