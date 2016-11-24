package com.hfad.viewpager.rest;

import com.hfad.viewpager.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

public interface ApiInterface {
    @GET("reviews/search.json")
    Call<NewsResponse> getNews(@Query("api_key") String api_key);

    @GET("reviews/search.json")
    Observable<NewsResponse> getNewsRX(@Query("api_key") String api_key);

<<<<<<< HEAD
    //@GET("news/{headline}")
    //Call<NewsResponse> getNewsDetails(@Path("headline") int id, @Query("api_key") String apiKey);

=======
    @GET("news/{headline}")
    Call<NewsResponse> getNewsDetails(@Path("headline") int id, @Query("api_key") String apiKey);
>>>>>>> refs/remotes/origin/master
}
