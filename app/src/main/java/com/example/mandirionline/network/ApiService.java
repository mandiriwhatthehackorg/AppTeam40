package com.example.mandirionline.network;

import com.example.mandirionline.network.model.ProductResponse;
import com.example.mandirionline.network.model.ServiceCustomerDetailResponse;
import com.example.mandirionline.network.model.TokenResponse;
import com.example.mandirionline.network.model.customeraccountnumber.CustomerBalanceResponse;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface ApiService {
    @GET("token")
    Call<TokenResponse> getAccessToken(@Header("Authorization") String clientIdClientSecret);

    @GET("ServicingAPI/1.0/customer/{cifNumber}")
    Call<ServiceCustomerDetailResponse> getCustomerDetail(
            @Path("cifNumber") String cifNUmber
    );

    @GET("ServicingAPI/1.0/customer/casa/{accountNumber}/balance")
    Call<CustomerBalanceResponse> getCustomerBalance(
            @Path("accountNumber") String Number
    );

    @GET("products")
    Call<List<ProductResponse>> getProducts();

}
