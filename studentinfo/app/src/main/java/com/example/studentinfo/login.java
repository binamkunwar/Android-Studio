package com.example.studentinfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.loginform.R;
import com.example.loginform.details;

public class login extends Activity implements AdapterView.OnItemSelectedListener {
    Button btn1;
    private EditText name,address,phone,email;
    private Button button;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        name = findViewById(R.id.name_field);
        address = findViewById(R.id.address_field);
        phone = findViewById(R.id.phone_field);
        email = findViewById(R.id.email_field);
        button = (Button)findViewById(R.id.button1);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = name.getText().toString();
                String useraddress = address.getText().toString();
                String userphone = phone.getText().toString();
                String useremail = email.getText().toString();
                Intent intent = new Intent(login.this, details.class);
                intent.putExtra("keyname", username);
                intent.putExtra("keyauserddress",useraddress);
                intent.putExtra("keyuserphone",userphone);
                intent.putExtra("keyuseremail",useremail);
                startActivity(intent);
            }
        });

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.provience_name, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
        String text = parent.getItemAtPosition(i).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
