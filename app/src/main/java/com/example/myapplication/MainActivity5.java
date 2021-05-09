package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {

    ListView lv;
    String [] title;
    String [] description;
    int []  image={R.drawable.apple,R.drawable.avocado,R.drawable.banana,R.drawable.grape,R.drawable.guavava,R.drawable.mango,
            R.drawable.orange,R.drawable.pineapple,R.drawable.pomegranate,R.drawable.strawberry,R.drawable.waterlemon};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main5);
            title=getResources().getStringArray(R.array.fruits);
            description=getResources().getStringArray(R.array.fruits_description);
            FruitAdapter fruitAdapter=new FruitAdapter(this,R.layout.roe_view, title, description, image);
            lv=findViewById(R.id.list);
            lv.setAdapter(fruitAdapter);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(MainActivity5.this,title[position]+" is currently not availble",Toast.LENGTH_LONG).show();
                }
            });

    }


}