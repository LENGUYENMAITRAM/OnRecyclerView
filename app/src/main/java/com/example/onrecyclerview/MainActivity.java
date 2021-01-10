package com.example.onrecyclerview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerViewFood;
    ArrayList<Food> mFoodList;
    FoodAdapter mFoodAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerViewFood=findViewById(R.id.recyclerview);
        mFoodList=Food.mock();
        mFoodAdapter=new FoodAdapter(mFoodList);

        mRecyclerViewFood.setHasFixedSize(true);
        mRecyclerViewFood.setItemViewCacheSize(20);
        mRecyclerViewFood.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRecyclerViewFood.setAdapter(mFoodAdapter);

        mFoodAdapter.setOnItemLongClickAdapterListener(new OnItemLongClickAdapterListener() {
            @Override
            public void OnItemLongClickListener(int position) {

            }
        });

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        return super.onContextItemSelected(item);
        switch (item.getItemId()){
            case R.id.edit:

        }
    }
}