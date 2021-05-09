package com.example.myapplication;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<String> {
    Context context;
    String [] fruit;
    String [] description;
    int[] img;


    public FruitAdapter(@NonNull Context context, int resource, String[] fruit, String[] description, int[] img) {
        super(context, resource,fruit);
        this.context=context;
        this.fruit = fruit;
        this.description = description;
        this.img = img;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater ift= LayoutInflater.from(getContext());
        View row=ift.inflate(R.layout.roe_view,parent,false);
        TextView tv1= row.findViewById(R.id.fruitId);
        TextView tv2= row.findViewById(R.id.description);
        ImageView iv= row.findViewById(R.id.img);
        tv1.setText(fruit[position]);
        tv2.setText(description[position]);
        iv.setImageResource(img[position]);
        return row;
    }
}
