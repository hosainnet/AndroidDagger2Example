package net.hosain.androiddagger2example.di;

import net.hosain.androiddagger2example.service.ApiService;
import net.hosain.androiddagger2example.service.RetrofitService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit.Retrofit;

@Module
public class ServiceModule {

    @Provides
    @Singleton
    public RetrofitService providesRetrofitService() {
        return new RetrofitService();
    }

    @Provides
    @Singleton
    public ApiService providesApiService(RetrofitService retrofitService) {
        Retrofit retrofit = retrofitService.buildRedditRetrofit();
        return retrofit.create(ApiService.class);
    }
}
