package com.example.mandirionline.network;

import com.example.mandirionline.network.model.TokenResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface ApiService {
    @GET("token")
    Call<TokenResponse> getAccessToken(@Header("Authorization") String clientIdClientSecret);

    @GET("ServicingAPI/1.0/customer/{cifNumber}")
    Call<ResponseBody> getCustomerDetail(
            @Path("cifNumber") String cifNUmber
    );

}
