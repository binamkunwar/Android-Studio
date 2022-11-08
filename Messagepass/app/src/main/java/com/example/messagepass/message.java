package com.example.messagepass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;


public class message extends Activity {
    EditText editText;
    Button btn;
    @Override
    public void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.messagebox);
        editText = (EditText) findViewById(R.id.textbox);
        btn = (Button) findViewById(R.id.save);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = editText.getText().toString();
                Intent intent = new Intent(message.this, launch.class);
                intent.putExtra("message", str);
                startActivity(intent);

            }
        });


    }
}

