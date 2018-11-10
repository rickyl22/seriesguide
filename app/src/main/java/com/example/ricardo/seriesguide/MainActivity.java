package com.example.ricardo.seriesguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void goToDiscover(View view){
        i = new Intent(this,Seasons.class);
        startActivity(i);
    }
}
