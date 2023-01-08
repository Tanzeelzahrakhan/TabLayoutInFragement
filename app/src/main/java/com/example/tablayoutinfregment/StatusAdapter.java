package com.example.tablayoutinfregment;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {
    ArrayList<ChatModelClass> List;
    StatusFragment context;

    public StatusAdapter(ArrayList<ChatModelClass> list, StatusFragment context) {
        List = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.recycler_design,parent,false);
        return new StatusAdapter.ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChatModelClass chatModelClass=List.get(position);
        holder.imge.setImageResource( chatModelClass.getImg());
        holder.textView.setText( chatModelClass.getName());
        holder.cardView.setBackgroundColor(Color.parseColor( chatModelClass.getColors()));
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imge;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView=itemView.findViewById(R.id.card);
            textView=itemView.findViewById(R.id.tv);
            imge=itemView.findViewById(R.id.image);

        }
    }
}
