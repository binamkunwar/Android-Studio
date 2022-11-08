package com.example.mvcrecycleview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewAdapter  extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    Activity context;
    ArrayList<MyData>data;


    public  RecycleViewAdapter(Activity context,ArrayList<MyData>data){
        this.context=context;
        this.data=data;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View listItem=layoutInflater.inflate(R.layout.recycleview_items,parent,false);
        RecyclerView.ViewHolder viewHolder=new ViewHolder(listItem);

        return (ViewHolder) viewHolder;
    }

    @Override
    public void onBindViewHolder( RecycleViewAdapter.ViewHolder holder, int position) {
        MyData current=data.get(position);
        holder.txtName.setText(current.getName());
        holder.txtAddress.setText(current.getAddress());
        holder.imageView.setImageResource(current.getImage());
    }
    @Override
    public  int getItemCount(){
        return  data.size();
        }
        public static class  ViewHolder extends  RecyclerView.ViewHolder{
        TextView txtName,txtAddress;
        ImageView imageView;
        public ViewHolder(View itemView){
            super(itemView);
            txtName=itemView.findViewById(R.id.txtName);
            txtAddress=itemView.findViewById(R.id.txtAddress);
            imageView=itemView.findViewById(R.id.image);
        }
    }
}
