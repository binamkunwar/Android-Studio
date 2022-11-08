package com.example.customlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    ListView list;
    String[] maintitle={
            "Title 1","Title 2",
            "Title 3","Title 4",
            "Title 5",
    };
    String [] subtitle={
            " Sub Title 1","Sub Title 2",
            "Sub Title 3","Sub Title 4",
            "Sub Title 5",
            };
    Integer[] imgid={
            R.drawable.facebook,R.drawable.dot,
            R.drawable.p,R.drawable.twitter,
            R.drawable.youtube,
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyListView adapter=new MyListView(this,maintitle,subtitle,imgid);
        list=(ListView) findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position = 0;
                if(position == 0){
                    Toast.makeText(getApplicationContext(), "Place Your First option Code", Toast.LENGTH_SHORT).show();

                }
                else if(position==1){
                    Toast.makeText(getApplicationContext(), "Place Your second option Code", Toast.LENGTH_SHORT).show();

                }
                else if(position==2){
                    Toast.makeText(getApplicationContext(), "Place Your third option Code", Toast.LENGTH_SHORT).show();

                }
                else if(position==3){
                    Toast.makeText(getApplicationContext(), "Place Your Fourth  option Code", Toast.LENGTH_SHORT).show();

                }
                else if(position==4){
                    Toast.makeText(getApplicationContext(), "Place Your Fifth option Code", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}
