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
    TextView textHair, textBody, textFace, textSkin;
    Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {

        textBody = findViewById(R.id.textItem);
        textSkin = findViewById(R.id.testSetting);
        textFace = findViewById(R.id.textHome);
        textHair = findViewById(R.id.textHair);
        textBody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textBody.setTextColor(Color.parseColor("#005B1B"));
                textHair.setTextColor(Color.parseColor("#373131"));
                textFace.setTextColor(Color.parseColor("#373131"));
                textSkin.setTextColor(Color.parseColor("#373131"));
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new BodyFragment())
                        .commit();
            }
        });


        textHair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                textBody.setTextColor(Color.parseColor("#373131"));
                textHair.setTextColor(Color.parseColor("#005B1B"));
                textFace.setTextColor(Color.parseColor("#373131"));
                textSkin.setTextColor(Color.parseColor("#373131"));
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new HairFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });


        textFace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textBody.setTextColor(Color.parseColor("#373131"));
                textHair.setTextColor(Color.parseColor("#373131"));
                textFace.setTextColor(Color.parseColor("#005B1B"));
                textSkin.setTextColor(Color.parseColor("#373131"));

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new FaceFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
        textSkin = findViewById(R.id.testSetting);
        textSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textBody.setTextColor(Color.parseColor("#373131"));
                textHair.setTextColor(Color.parseColor("#373131"));
                textFace.setTextColor(Color.parseColor("#373131"));
                textSkin.setTextColor(Color.parseColor("#005B1B"));
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new SkinFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });


    }


}