package com.example.movieproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView iv_detailImage;
    TextView tv_detailTitle;
    TextView tv_detailOverview;
    TextView tv_detailYear;
    Button b_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_detailImage = findViewById(R.id.iv_detailImage);
        tv_detailTitle = findViewById(R.id.tv_detailTitle);
        tv_detailOverview = findViewById(R.id.tv_detailOverview);
        tv_detailYear = findViewById(R.id.tv_detailYear);

        Bundle bundle = getIntent().getExtras();
        String data [] = bundle.getStringArray("data");

        Glide.with(getApplicationContext())
                .load("https://image.tmdb.org/t/p/w185" + data[2])
                .into(iv_detailImage);
        tv_detailTitle.setText(data[0]);
        tv_detailOverview.setText(data[1]);
        tv_detailYear.setText(data[3]);

        b_back = findViewById(R.id.b_back);
        b_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}