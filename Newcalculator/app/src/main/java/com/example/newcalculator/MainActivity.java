package com.example.newcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button idBtnAC, idBtnC, idBtn1, idBtn2, idBtn3, idBtn4, idBtn5, idBtn6, idBtn7, idBtn8, idBtn9, idBtn0, idBtnP, idBtnS, idBtnM, idBtnD, idBtnE, idBtnO, idBtnL, idBtnR;
    TextView tvmain, tvsec;
    EditText ed1;
    float res1,res2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idBtn0 = findViewById(R.id.idBtn0);
        idBtn1 = findViewById(R.id.idBtn1);
        idBtn2 = findViewById(R.id.idBtn2);
        idBtn3 = findViewById(R.id.idBtn3);
        idBtn4 = findViewById(R.id.idBtn4);
        idBtn5 = findViewById(R.id.idBtn5);
        idBtn6 = findViewById(R.id.idBtn6);
        idBtn7 = findViewById(R.id.idBtn7);
        idBtn8 = findViewById(R.id.idBtn8);
        idBtn9 = findViewById(R.id.idBtn9);
        idBtn0 = findViewById(R.id.idBtn0);
        idBtnAC = findViewById(R.id.idBtnAC);
        idBtnC = findViewById(R.id.idBtnC);
        idBtnP = findViewById(R.id.idBtnP);
        idBtnS = findViewById(R.id.idBtnS);
        idBtnM = findViewById(R.id.idBtnM);
        idBtnD = findViewById(R.id.idBtnD);
        idBtnE = findViewById(R.id.idBtnE);
        idBtnO = findViewById(R.id.idBtnO);
        idBtnL = findViewById(R.id.idBtnL);
        idBtnR = findViewById(R.id.idBtnR);


        tvmain = findViewById(R.id.tvmain);
        tvsec = findViewById(R.id.tvsec);

        //onclick listers
        idBtn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "0");
            }
        });

        idBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "1");
            }
        });

        idBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "2");
            }
        });

        idBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "3");
            }
        });

        idBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "4");
            }
        });

        idBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "5");
            }
        });

        idBtn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "6");
            }
        });

        idBtn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "7");
            }
        });

        idBtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "8");
            }
        });

        idBtn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "9");
            }
        });


        idBtnO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + ".");
            }
        });

        idBtnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText("");
            }
        });

        idBtnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val = tvmain.getText().toString();
                val = val.substring(0, val.length() - 1);
                tvmain.setText(val);
            }
        });

        idBtnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvmain.setText(tvmain.getText() + "+");
            }
        });

        idBtnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvmain.setText(tvmain.getText() + "-");
            }
        });

        idBtnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvmain.setText(tvmain.getText() + "*");
            }
        });
        idBtnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tvmain.setText(tvmain.getText() + "/");
            }
        });

        idBtnL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + "(");
            }
        });

        idBtnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText() + ")");
            }
        });






        idBtnE.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
   String val=tvmain.getText().toString();
    tvsec.setText(val);

    }
});

    }

    }



