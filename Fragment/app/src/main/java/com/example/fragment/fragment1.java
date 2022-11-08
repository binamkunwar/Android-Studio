package com.example.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class fragment1 extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    EditText editFirst,editSecond;
    Button btnCalculate;
    TextView txtResult;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //wiring up wodgets
        View view = inflater.inflate(R.layout.fragment1, container,false);
        editFirst = view.findViewById(R.id.firstvalue);
        editSecond = view.findViewById(R.id.secondvalue);
        btnCalculate = view.findViewById(R.id.addbtn);
        txtResult = view.findViewById(R.id.result);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first,second,result;
                first = Integer.parseInt(editFirst.getText().toString());
                second = Integer.parseInt(editSecond.getText().toString());
                result=first+second;
                txtResult.setText("Result="+result);
            }
        });
        return view;
    }
}

