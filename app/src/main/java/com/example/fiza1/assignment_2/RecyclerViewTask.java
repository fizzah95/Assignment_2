package com.example.fiza1.assignment_2;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class RecyclerViewTask extends Fragment {
private RecyclerView recyclerview;
 private Adapter_Contacts adapter;


    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
 View layout=inflater.inflate(R.layout.activity_main,container,false);
      recyclerview= (RecyclerView) layout.findViewById(R.id.contact_list);
        adapter=new Adapter_Contacts(getActivity() ,getData());
        recyclerview.setAdapter(adapter);
        recyclerview.setLayoutManager(new LinearLayoutManager((getActivity())));
        return layout;
    }

    public static List<Contact_Information> getData(){
        List<Contact_Information> data=new ArrayList<>();
int[] icons={R.drawable.pic,R.drawable.pic};
      String[] title={"Star","Colors"};
        for(int i=0;i<title.length && i<icons.length;i++){
            Contact_Information current=new Contact_Information();
            current.iconId=icons[i];
            current.title=title[i];
            data.add(current);
        }
return data;
    }


}