package com.example.messagepass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class launch  extends Activity {
    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch);
        textView = (TextView) findViewById(R.id.pass);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView.setText(str);

    }
}
