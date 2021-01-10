package com.example.onrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {
    ArrayList<Food> mFoodList;
    OnItemLongClickAdapterListener mOnItemLongClickAdapterListener;

    public FoodAdapter (ArrayList<Food> mFoodList){
        this.mFoodList=mFoodList;
    }

    
    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_food, parent, false);
        return new FoodHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        Food food=mFoodList.get(position);
        holder.tvName.setText(food.getName());
        holder.tvPrice.setText(food.getPrice()+"");
        holder.tvAddress.setText(food.getAddress());
        holder.imageView.setImageResource(food.getImage());
    }

    @Override
    public int getItemCount() {
        return mFoodList.isEmpty() ? 0 : mFoodList.size();
    }

    public class FoodHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName, tvPrice, tvAddress;
        public FoodHolder(@NonNull final View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageFood);
            tvName=itemView.findViewById(R.id.tvName);
            tvPrice=itemView.findViewById(R.id.tvPrice);
            tvAddress=itemView.findViewById(R.id.tvAddress);

            //truyền position từ adapter sang main khi click view
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    mOnItemLongClickAdapterListener.OnItemLongClickListener(getLayoutPosition());
                    return false;
                }
            });
        }
    }

    public void setOnItemLongClickAdapterListener(OnItemLongClickAdapterListener mOnItemLongClickAdapterListener){
        this.mOnItemLongClickAdapterListener = mOnItemLongClickAdapterListener;
    }
}
