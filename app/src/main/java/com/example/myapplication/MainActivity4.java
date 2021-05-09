package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void make_call(View view){
        Intent it=new Intent(Intent.ACTION_DIAL);
        startActivity(it);
    }
    public void send_mail(View view){
        Intent it = new Intent(Intent.ACTION_SENDTO);
        it.setData(Uri.parse("mailto:"));
        startActivity(it);
    }
    public void open_youtube(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube://"));
        startActivity(intent);
    }
    public void open_music(View view){
        Intent intent = new Intent("android.intent.action.MUSIC_PLAYER");
        startActivity(intent);
    }
}