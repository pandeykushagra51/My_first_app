package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reverse1(View view){

        Toast.makeText(this, "string is reversed", Toast.LENGTH_SHORT).show();  // toast to display string

        EditText str=findViewById(R.id.enter_password);
        TextView str1=findViewById(R.id.reversed_string);
        String input=str.getText().toString();

        StringBuilder ans = new StringBuilder();

        // append a string into StringBuilder input1
        ans.append(input);
        ans.reverse();
        str1.setText("reversed string is : "+ans);
    }

    public void next_page(View view){

          Intent it1=new Intent(this,MainActivity2.class);
          startActivity(it1);

    }

}