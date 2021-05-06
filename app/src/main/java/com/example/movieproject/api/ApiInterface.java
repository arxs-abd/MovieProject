package com.example.movieproject.api;

import com.example.movieproject.modelMovie.ResponseMovie;
import com.example.movieproject.modelTVShow.ResponseTVShow;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("/3/movie/{category}")
    Call<ResponseMovie> getMovie(
            @Path("category") String category,
            @Query("api_key") String api_key,
            @Query("language") String lang,
            @Query("page") int page
    );

    @GET("/3/tv/{category}")
    Call<ResponseTVShow> getTVShow(
            @Path("category") String category,
            @Query("api_key") String api_key,
            @Query("language") String lang,
            @Query("page") int page
    );
}
