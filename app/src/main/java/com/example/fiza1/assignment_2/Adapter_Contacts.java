package com.example.fiza1.assignment_2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by Fiza1 on 13-Oct-17.
 */
public class Adapter_Contacts extends RecyclerView.Adapter<Adapter_Contacts.MyViewHolder> {
public LayoutInflater inflater;
    List<Contact_Information> data=Collections.emptyList();
    protected Adapter_Contacts(Context context, List<Contact_Information> data){
        inflater=LayoutInflater.from(context);
        this.data=data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) { //called when recycler view needs aRecyclerView.ViewHolder to represent an item
       View view =inflater.inflate(R.layout.contacts,parent,false);
MyViewHolder holder=new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) { //display data at specified position
Contact_Information current=data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title= (TextView) itemView.findViewById(R.id.list_titles);
            icon=(ImageView)itemView.findViewById(R.id.list_icons);

        }
    }
}
