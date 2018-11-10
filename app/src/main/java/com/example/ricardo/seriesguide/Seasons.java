package com.example.ricardo.seriesguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.converter.gson.GsonConverterFactory;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import retrofit2.Retrofit;

public class Seasons extends AppCompatActivity {

    ArrayList<Season> datos ;
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seasons);

        recycler = (RecyclerView) findViewById(R.id.recycler_seasons);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        datos = new ArrayList<Season>();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(SeriesAPI.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        SeriesAPI api = retrofit.create(SeriesAPI.class);
        Call<Series> call = api.getSeries();
        call.enqueue(new Callback<Series>() {
            @Override
            public void onResponse(Call<Series> call, Response<Series> response) {
                Series ser = response.body();

                for(int i=1;i<=ser.getTotalSeasons();i++){
                    datos.add(new Season(i,"some remaining","6/10",100,ser.getImdbID()));
                }
                AdapterItem adapter = new AdapterItem(datos);
                adapter.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        Intent i = new Intent(getApplicationContext(),EpisodeListActivity.class);
                        i.putExtra("season",datos.get(recycler.getChildAdapterPosition(view)).getNumber());
                        i.putExtra("seriesID",datos.get(recycler.getChildAdapterPosition(view)).getSeriesID());
                        startActivity(i);
                    }
                });
                recycler.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<Series> call, Throwable t) {
                System.out.println("error ------> "+t.getMessage());
            }
        });


    }

    public void goToEpisodes(View view){
        Intent i = new Intent(this,Overview.class);
        startActivity(i);
    }
    public void goToFavorites(View view){
        Intent i = new Intent(this,EpisodeListActivity.class);
        startActivity(i);
    }


}
