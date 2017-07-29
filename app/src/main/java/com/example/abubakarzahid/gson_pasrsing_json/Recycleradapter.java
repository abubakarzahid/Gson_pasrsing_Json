package com.example.abubakarzahid.gson_pasrsing_json;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abubakar zahid on 7/29/2017.
 */

public class Recycleradapter extends RecyclerView.Adapter<Recycleradapter.MyviewHolder> {
    private List<Contact> list = new ArrayList<>();

    Recycleradapter(List<Contact> list)
    {
        this.list = list;
    }

    @Override
    public MyviewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.data_view,parent,false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyviewHolder holder, int position) {
        holder.Id.setText(Integer.toString(list.get(position).getId()));
        holder.Name.setText(list.get(position).getFirst_name());
        holder.Email.setText(list.get(position).getEmail());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyviewHolder extends RecyclerView.ViewHolder {
        TextView Id , Name, Email;
        public MyviewHolder(View itemView) {
            super(itemView);
            Id =  itemView.findViewById(R.id.jid);
            Name = itemView.findViewById(R.id.jfirstname);
            Email = itemView.findViewById(R.id.jemail);
        }
    }


}
