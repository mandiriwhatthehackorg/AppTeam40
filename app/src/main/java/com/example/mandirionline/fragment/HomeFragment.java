package com.example.mandirionline.fragment;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mandirionline.R;
import com.example.mandirionline.network.ApiClient;
import com.example.mandirionline.network.ApiService;
import com.example.mandirionline.network.model.ServiceCustomerDetailResponse;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setupNama();
        view = inflater.inflate(R.layout.fragment_home, container, false);
        return view;
    }

    private void setupNama() {
        ApiService apiService = ApiClient.getInstance2(getContext()).create(ApiService.class);
        Call<ServiceCustomerDetailResponse> call = apiService.getCustomerDetail("1000009024");
        call.enqueue(new Callback<ServiceCustomerDetailResponse>() {
            @Override
            public void onResponse(Call<ServiceCustomerDetailResponse> call, Response<ServiceCustomerDetailResponse> response) {
                TextView namaTextview = view.findViewById(R.id.name_customer);
                String name = response.body().getResponse().getCif().getCIFName1() + " " +response.body().getResponse().getCif().getCIFName2();
                namaTextview.setText(name);
                Log.d("TAGGER", response.toString());
            }

            @Override
            public void onFailure(Call<ServiceCustomerDetailResponse> call, Throwable t) {
                Log.d("ERROR",t.toString());
            }
        });
    }

}
