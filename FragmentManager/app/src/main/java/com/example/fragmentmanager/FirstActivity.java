package com.example.fragmentmanager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.app.FragmentManager;
import androidx.annotation.Nullable;
import android.app.FragmentTransaction;
import android.app.Fragment;


public class FirstActivity extends Activity {
    Button btnFirst,btnSecond;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);


        btnFirst=findViewById(R.id.btnFirst);
        btnSecond=findViewById(R.id.btnSecond);


        btnFirst.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Fragment fragment= new fragment1();
                FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction= manager.beginTransaction();
                transaction.replace(R.id.myfragment,fragment);
                transaction.commit();
            }
        });
        btnSecond.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Fragment fragment=new fragment2();
                FragmentManager manager=getFragmentManager();
                FragmentTransaction transaction= manager.beginTransaction();
                transaction.replace(R.id.myfragment,fragment);
                transaction.commit();
            }
        });
    }
}
