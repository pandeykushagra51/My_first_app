package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText name,email_adress,collage,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void show_info(View view){
        Intent it=new Intent(this,MainActivity3.class);
        name=findViewById(R.id.enter_name);
        collage=findViewById(R.id.enter_collage_name);
        email_adress=findViewById(R.id.enter_email);
        phone=findViewById(R.id.enter_phone);
        it.putExtra("name",name.getText().toString());
        it.putExtra("collage_name",collage.getText().toString());
        it.putExtra("email_id",email_adress.getText().toString());
        it.putExtra("phone_number",phone.getText().toString());
        startActivity(it);
    }
}