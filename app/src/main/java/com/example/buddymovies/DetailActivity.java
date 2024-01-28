package com.example.buddymovies;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView img;
    TextView txt;
    TextView txt2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        Intent intent = getIntent();
        int Image = intent.getIntExtra("Image",0);
        String Title = intent.getStringExtra("Title");
        String Desc =  intent.getStringExtra("Desc");
        img = findViewById(R.id.recImage);
        txt = findViewById(R.id.textDetail);
        txt2 = findViewById(R.id.textDetail2);

        img.setImageResource(Image);
        txt.setText(Title);
        txt2.setText(Desc);
    }

}