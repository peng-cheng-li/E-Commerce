package com.example.e_commerce.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.e_commerce.fragment.BodyFragment;
import com.example.e_commerce.R;
import com.example.e_commerce.fragment.FaceFragment;
import com.example.e_commerce.fragment.HairFragment;
import com.example.e_commerce.fragment.SkinFragment;
;

public class MainActivity extends AppCompatActivity {
    TextView textCart, textChart, textHome, textSetting;
    Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        textChart = findViewById(R.id.textChart);
        textSetting = findViewById(R.id.testSetting);
        textHome = findViewById(R.id.textHome);
        textCart = findViewById(R.id.textCart);
        textChart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textChart.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textCart.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textHome.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textSetting.setBackgroundColor(Color.parseColor("#F5F5F5"));
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new BodyFragment())
                        .commit();
            }
        });


        textCart.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textChart.setBackgroundColor(Color.parseColor("#00000"));
                textCart.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textHome.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textSetting.setBackgroundColor(Color.parseColor("#F5F5F5"));
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new HairFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });


        textHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textChart.setBackgroundColor(Color.parseColor("#000"));
                textCart.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textHome.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textSetting.setBackgroundColor(Color.parseColor("#F5F5F5"));

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new FaceFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        textSetting = findViewById(R.id.testSetting);
        textSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textChart.setBackgroundColor(Color.parseColor("#000"));
                textCart.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textHome.setBackgroundColor(Color.parseColor("#F5F5F5"));
                textSetting.setBackgroundColor(Color.parseColor("#F5F5F5"));
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new SkinFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });


    }


}