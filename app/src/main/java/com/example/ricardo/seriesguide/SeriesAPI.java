package com.example.ricardo.seriesguide;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import java.util.List;


public interface SeriesAPI {

        String BASE_URL = "http://www.omdbapi.com/";

    @GET("?apikey=b4d74009&i=tt0944947")
    Call<List<Series>> getSeries(@Query("season") String season);

    @GET("?apikey=b4d74009&i=tt0944947")
    Call<Series> getSeries();

    @GET("?apikey=b4d74009&i=tt0944947")
    Call<Season> getSeason(@Query("season") String season);

    @GET("?apikey=b4d74009&i=tt0944947")
    Call<Episode> getEpisodes(@Query("season") String season,@Query("episode") String episode);

}
