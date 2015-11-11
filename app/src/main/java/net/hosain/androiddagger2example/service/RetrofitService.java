package net.hosain.androiddagger2example.service;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class RetrofitService {

    public Retrofit buildRedditRetrofit() {
        return new Retrofit.Builder()
                .baseUrl("http://reddit.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
