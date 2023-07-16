package com.threemeadows.a3mcafeteria;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.ViewHolder> {
    private Context context;
    private List<Drinks> drinks;

    public DrinksAdapter(List<Drinks> drinks){
        this.drinks = drinks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        View convertView = LayoutInflater.from(context).inflate(R.layout.row_item_drinks,parent,false);
        ViewHolder viewHolder = new ViewHolder(convertView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DrinksAdapter.ViewHolder holder, int position) {
        Drinks dd = drinks.get(position);
        holder.ivDrinkImage.setImageDrawable(ContextCompat.getDrawable(holder.context, dd.getmSmallImageSrcId()));
        holder.tvDrinkName.setText(dd.getmName());

    }

    @Override
    public int getItemCount() {
        return drinks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public ImageView ivDrinkImage;
        public TextView tvDrinkName;
        public Context context;
        public View parentView;

        public ViewHolder(View itemView){
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            ivDrinkImage = itemView.findViewById(R.id.iv_drink_small);
            tvDrinkName = itemView.findViewById(R.id.tv_drink_name);
            parentView = itemView;

        }
        @Override
        public void onClick(View view){
            int position = this.getAdapterPosition();
            Log.i("DrinkAdapter", "item clicked........");
            Intent drinkDetailIntent = new Intent(context, DrinksDetails.class);
            drinkDetailIntent.putExtra(Drinks.KEY_DRINK_NAME, drinks.get(position).getmName());
            drinkDetailIntent.putExtra(Drinks.KEY_DRINK_DESCRIPTION,drinks.get(position).getmDescription());
            drinkDetailIntent.putExtra(Drinks.KEY_DRINK_LARGE_IMAGE_ID, drinks.get(position).getmLargeImageSrcId());
            context.startActivity(drinkDetailIntent);
        }
    }
}
