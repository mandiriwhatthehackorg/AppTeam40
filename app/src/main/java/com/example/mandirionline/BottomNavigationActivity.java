package com.example.mandirionline;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.mandirionline.fragment.HomeFragment;
import com.example.mandirionline.fragment.OtherFragment;
import com.example.mandirionline.fragment.PortofolioFragment;
import com.example.mandirionline.fragment.ProductFragment;

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
    }

}
