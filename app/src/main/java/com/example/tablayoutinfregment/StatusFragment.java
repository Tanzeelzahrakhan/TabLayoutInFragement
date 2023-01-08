package com.example.tablayoutinfregment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class StatusFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<ChatModelClass> List = new ArrayList<>();
   StatusAdapter statusAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List.add(new ChatModelClass("Tanzeel",R.drawable.a,"#388E3C"));
        List.add(new ChatModelClass("zahra",R.drawable.b,"#6A1B9A"));
        List.add(new ChatModelClass("Mehrab",R.drawable.c,"#C62828"));
        List.add(new ChatModelClass("Alia",R.drawable.d,"#FF6F00"));
        List.add(new ChatModelClass("Tanzeel",R.drawable.a,"#1E88E5"));
        List.add(new ChatModelClass("Mehrab",R.drawable.c,"#311B92"));

        statusAdapter= new StatusAdapter(List,StatusFragment.this);

        recyclerView.setAdapter(statusAdapter);

        return  view;

    }

}