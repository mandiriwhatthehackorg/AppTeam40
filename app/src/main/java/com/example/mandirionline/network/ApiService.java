package com.example.mandirionline.network;

import com.example.mandirionline.network.model.TokenResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface ApiService {
    @GET("token")
    Call<TokenResponse> getAccessToken(@Header("Authorization") String clientIdClientSecret);
}
