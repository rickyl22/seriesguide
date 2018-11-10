package com.example.ricardo.seriesguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class Discover extends AppCompatActivity {

    private Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
    }
    public void goToOverview(View view){
        i = new Intent(this,Overview.class);
        startActivity(i);
    }
}
