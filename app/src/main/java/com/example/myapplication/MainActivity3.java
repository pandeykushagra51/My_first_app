package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static java.lang.System.*;

public class MainActivity3 extends AppCompatActivity {
    TextView name,collage,email_id,phone_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        name=findViewById(R.id.act3_name);
        collage=findViewById(R.id.act3_collage);
        email_id=findViewById(R.id.act3_email_id);
        phone_number=findViewById(R.id.act3_phone_number);
        Intent it=getIntent();
        Bundle bd=it.getExtras();

        if (!(bd.getString("name")).isEmpty() ){
            name.setText("Your name is "+bd.getString("name"));
        }
        else{
            name.setText("name is not entered on previous page");
        }
        if ( !(bd.getString("collage_name")).isEmpty()) {
            collage.setText("your collage name is " + bd.getString("collage_name"));
        }
        else{
            collage.setText("collage name is not entered on previous page");
        }
        if ( !(bd.getString("email_id")).isEmpty() ) {
            email_id.setText("Your email id is " + bd.getString("email_id"));
        }
        else{
            email_id.setText("email id is not entered on previous page");
        }
        if ( !(bd.getString("phone_number")).isEmpty() ) {
            phone_number.setText("Your phone number is " + bd.getString("phone_number"));
        }
        else{
            phone_number.setText("phone number is not entered on previous page");
        }
    }


}