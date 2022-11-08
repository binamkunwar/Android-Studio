package com.example.datafetch;
import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
public class JsonExample extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        volleyRequest();
    }

    public void volleyRequest(){
        RequestQueue queue = Volley.newRequestQueue(this);

        String url = "http://192.168.0.163:8000/1.php";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>(){
            @Override
            public void onResponse(String response) {
                decodeJson(response);
            }
        },new Response.ErrorListener(){
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("exception",error.toString());
            }
        });

        queue.add(stringRequest);
    }

    public void decodeJson(String response){
        try{
            JSONObject result = new JSONObject(response);
            JSONArray array=result.getJSONArray("data");
            for(int i=0;i<array.length();i++){
                JSONObject student=array.getJSONObject(i);
                int sid=student.getInt("sid");
                String name=student.getString("Name");
                String address=student.getString("address");

                Log.d("Data: ",i+" ID: "+sid+" Name: "+name+ " Address: "+address);
            }
        }catch (Exception ex){
            Log.d("exception",ex.toString());
        }
    }
}
