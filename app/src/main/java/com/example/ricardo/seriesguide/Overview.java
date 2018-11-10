package com.example.ricardo.seriesguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Overview extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);
        Intent i = getIntent();
        int season = i.getIntExtra("season",0);
        int episode = i.getIntExtra("episode",0);
        ImageView img = findViewById(R.id.ep_image);
        if(season == 1){
            if(episode % 2 == 0){
                img.setImageResource(R.drawable.got_1);
            }else{
                img.setImageResource(R.drawable.got_2);
            }
        }else if(season == 2){
            if(episode % 2 == 0){
                img.setImageResource(R.drawable.got_3);
            }else{
                img.setImageResource(R.drawable.got_4);
            }
        }else{
            if(episode % 2 == 0){
                img.setImageResource(R.drawable.got_5);
            }else{
                img.setImageResource(R.drawable.got_6);
            }
        }
    }

}
