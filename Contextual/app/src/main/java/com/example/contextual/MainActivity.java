package com.example.contextual;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity  extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        textView=(TextView)  findViewById(R.id.text);

        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Chose your Option");
        getMenuInflater().inflate(R.menu.main_activity,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.one:
            Toast.makeText(context: this,text: "One".Toast.LENGTH_SHORT);
            return true;

            case R.id.two:
                Toast.makeText(context: this,text: "One".Toast.LENGTH_SHORT);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
