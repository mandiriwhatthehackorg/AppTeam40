package com.example.mandirionline;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.mandirionline.fragment.HomeFragment;
import com.example.mandirionline.fragment.OtherFragment;
import com.example.mandirionline.fragment.PortofolioFragment;
import com.example.mandirionline.fragment.ProductFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

    }

}
