package com.example.mandirionline.network;

import android.content.Context;
import android.util.Log;

import com.example.mandirionline.AppConfig;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit;
    public static Retrofit retrofit2;
    public static Retrofit retrofit3;

    public static Retrofit getInstance(){
        if (retrofit == null){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .addInterceptor(new Interceptor() {
                        @NotNull
                        @Override
                        public Response intercept(@NotNull Chain chain) throws IOException {
                            Request.Builder requestBuilder = chain.request().newBuilder();
                            requestBuilder.header("Content-Type", "application/json");
                            return chain.proceed(requestBuilder.build());
                        }
                    })
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(AppConfig.BASE_URL_API_API_GATEWAY)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }



    public static Retrofit getInstance2(Context context){
        if (retrofit2 == null){
            final String token = "eyJraWQiOiJqd3RrZXkiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiI4ZTI5ODczMS0yY2I1LTQ3NDktYTZkMS01YzlhYWYwOTM4NzUiLCJhdWQiOlsiMjFkYjRmOTctYjk0Mi00OGY2LWI2ZTAtZjljODczMDJiYzk3IiwibWFuZGlyaV9oYWNrYXRob25fdGVhbSJdLCJuYmYiOjE1NjM1OTUxMzQsImlzcyI6Imh0dHBzOlwvXC93d3cuYmFua21hbmRpcmkuY28uaWRcLyIsImV4cCI6MTU2MzgxMTEzNCwiaWF0IjoxNTYzNTk1MTM0LCJhcHBfaWQiOiIyMWRiNGY5Ny1iOTQyLTQ4ZjYtYjZlMC1mOWM4NzMwMmJjOTcifQ.NNG9sVbLyb3HZPedTf9u8aLIne43YNmpyEIiWvbCMquCjYS24fPFwm_1S7jjoRZ3Yw8hOiY7V86VTOy6yrKhyNk7aaeI9xrB3uaGSMEwIJrbDNP0iASmM_vvPmQv8q0dkoqJngxPh8tnjl8Z0ZU034F32jPfqlZ7n7jdtxdNrxs";
            Log.d("Blo", "getInstance2: " + token);
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .addInterceptor(new Interceptor() {
                        @NotNull
                        @Override
                        public Response intercept(@NotNull Chain chain) throws IOException {
                            Request.Builder requestBuilder = chain.request().newBuilder();
                            requestBuilder.addHeader("Content-Type", "application/json");
                            requestBuilder.addHeader("Authorization", "Bearer " + token);

                            return chain.proceed(requestBuilder.build());
                        }
                    }).build();

            retrofit2 = new Retrofit.Builder()
                    .baseUrl(AppConfig.BASE_URL_API_API_GATEWAY)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit2;
    }

    public static Retrofit getInstance3(Context context){
        if (retrofit3 == null){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(interceptor)
                    .addInterceptor(new Interceptor() {
                        @NotNull
                        @Override
                        public Response intercept(@NotNull Chain chain) throws IOException {
                            Request.Builder requestBuilder = chain.request().newBuilder();
                            requestBuilder.addHeader("Content-Type", "application/json");

                            return chain.proceed(requestBuilder.build());
                        }
                    })
                    .build();

            retrofit3 = new Retrofit.Builder()
                    .baseUrl(AppConfig.BASE_URL_WEB_SERVICE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit3;
    }
}