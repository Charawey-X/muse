package com.example.muse.network;
import com.example.muse.models.SearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface GeniusApi {
   @GET("/search")
    Call<SearchResponse> getResults(
            @Header("x-rapidapi-ua") String playGround,
            @Header("X-RapidAPI-Key") String keyHeader,
            @Header("X-RapidAPI-Host") String hostHeader,
            @Query("apikey") String apikey,
            @Query("q") String song_artist
    );
}
