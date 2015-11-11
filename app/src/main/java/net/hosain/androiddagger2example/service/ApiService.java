package net.hosain.androiddagger2example.service;

import net.hosain.androiddagger2example.model.User;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

public interface ApiService {
    @GET("/user/{user}/about.json")
    Call<User> getUser(@Path("user") String user);
}
