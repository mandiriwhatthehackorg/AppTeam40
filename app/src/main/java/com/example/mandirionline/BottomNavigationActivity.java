package com.example.mandirionline;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.mandirionline.fragment.HomeFragment;
import com.example.mandirionline.fragment.OtherFragment;
import com.example.mandirionline.fragment.PortofolioFragment;
import com.example.mandirionline.fragment.ProductFragment;
import com.example.mandirionline.network.ApiClient;
import com.example.mandirionline.network.ApiService;
import com.example.mandirionline.network.model.TokenResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BottomNavigationActivity extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fm = getSupportFragmentManager();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    HomeFragment homeFragment = new HomeFragment();
                    fm.beginTransaction()
                            .replace(R.id.container_inside, homeFragment)
                            .commit();
                    return true;
                case R.id.navigation_product:
                    ProductFragment productFragment= new ProductFragment();
                    fm.beginTransaction()
                            .replace(R.id.container_inside, productFragment)
                            .commit();
                    return true;
                case R.id.navigation_portofolio:
                    PortofolioFragment fragment = new PortofolioFragment();
                    fm.beginTransaction()
                            .replace(R.id.container_inside, fragment)
                            .commit();
                    return true;
                case R.id.navigation_other:
                    OtherFragment otherFragment= new OtherFragment();
                    fm.beginTransaction()
                            .replace(R.id.container_inside, otherFragment)
                            .commit();
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setSelectedItemId(R.id.navigation_home);
        testRetrofit();
    }


    void testRetrofit(){
        ApiService apiService = ApiClient.getInstance().create(ApiService.class);
        Call<TokenResponse> call = apiService.getAccessToken("Basic OGUyOTg3MzEtMmNiNS00NzQ5LWE2ZDEtNWM5YWFmMDkzODc1OmQwNWNmM2Y0LTllOWEtNGI2NS04YzBkLTY2ZTkwYWEyNmM4Yw==");
        call.enqueue(new Callback<TokenResponse>() {
            @Override
            public void onResponse(Call<TokenResponse> call, Response<TokenResponse> response) {
                Log.d("TAGGER", response.body().getJwt());
            }

            @Override
            public void onFailure(Call<TokenResponse> call, Throwable t) {
                Log.d("ERROR",t.toString());
            }
        });
    }

    void saveTokenInPreference(){

    }
}
