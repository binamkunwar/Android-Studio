package com.example.loginform;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class details extends Activity {
    private TextView  name, address, phone,email;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details);
        name= findViewById(R.id.name_name2);
        address= findViewById(R.id.address_name2);
        phone= findViewById(R.id.phone_name2);
        email = findViewById(R.id.email_name2);
        //gender= findViewById(R.id.gander_name2);

        String username = getIntent().getStringExtra("keyname");
        String useraddress = getIntent().getStringExtra("keyauserddress");
        String userphone = getIntent().getStringExtra("keyuserphone");
        String useremail = getIntent().getStringExtra("keyuseremail");
        //String usergender = getIntent().getStringExtra("keyusergender");

        name.setText(username);
        address.setText(useraddress);
        phone.setText(userphone);
        email.setText(useremail);
        //email.setText(usergender);
    }
}