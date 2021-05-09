package com.example.myapplication;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.google.gson.Gson;

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

        if(bd.containsKey("student_detail")){
            Gson gson = new Gson();
            String studentDetail = bd.getString("student_detail");
            Student student = gson.fromJson(studentDetail, Student.class);

            if (!TextUtils.isEmpty(student.name)){
                name.setText("Your name is "+student.name);
            }
            else{
                name.setText("name is not entered on previous page");
            }
            if ( !TextUtils.isEmpty(student.collegeName) ) {
                collage.setText("your collage name is " + student.collegeName);
            }
            else{
                collage.setText("collage name is not entered on previous page");
            }
            if (!TextUtils.isEmpty(student.emailId)) {
                email_id.setText("Your email id is " +student.emailId);
            }
            else{
                email_id.setText("email id is not entered on previous page");
            }
            if (!TextUtils.isEmpty(student.phoneNumber)) {
                phone_number.setText("Your phone number is " + student.phoneNumber);
            }
            else{
                phone_number.setText("phone number is not entered on previous page");
            }
        }
    }
}