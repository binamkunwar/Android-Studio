package com.example.alertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class FirstActivity extends Activity {
    Button btnClick;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
        btnClick=findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    public void showDialog() {
        AlertDialog.Builder builder=new AlertDialog.Builder(FirstActivity.this);
        builder.setTitle("Exit App");
        builder.setMessage("Do you want to exit app?");
        builder.setCancelable(true);
        builder.setPositiveButton(
                "Yes" ,new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int i){
                    }
                        });
        builder.setNegativeButton(
                "No" ,new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int i){
                dialog.cancel();
            }
        });
        AlertDialog alert= builder.create();
        alert.show();
    }
}
