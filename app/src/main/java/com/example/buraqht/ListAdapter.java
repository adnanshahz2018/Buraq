package com.example.buraqht;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ListViewHoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ListViewHoder) holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Data.title.length;
    }

    private class ListViewHoder extends RecyclerView.ViewHolder implements RecyclerView.OnClickListener{
        private TextView hotelName;
        private TextView cityName;
        private ImageView imageItem;

        public ListViewHoder(View itemView){
            super(itemView);
            hotelName = itemView.findViewById(R.id.item_text);
            imageItem = itemView.findViewById(R.id.item_image);
            cityName = itemView.findViewById(R.id.item_text2);
            itemView.setOnClickListener(this);
        }

        public void bindView(int position){
            hotelName.setText(Data.title[position]);
            cityName.setText(Data.city[position]);
            imageItem.setImageResource(Data.picturPath[position]);
        }

        public void onClick(View view){

        }
    }
}
