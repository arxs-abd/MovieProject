package com.example.movieproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.movieproject.menu.NowPlaying;
import com.example.movieproject.menu.TvShow;
import com.example.movieproject.menu.Upcoming;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bnv_nav_menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bnv_nav_menu = findViewById(R.id.bnv_bottom_nav);
        bnv_nav_menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()) {
                    case R.id.nav_bottom_now_playing :
                        fragment = new NowPlaying();
                        break;
                    case R.id.nav_bottom_tv_show :
                        fragment = new TvShow();
                        break;
                    case R.id.nav_bottom_upcoming :
                        fragment = new Upcoming();
                        break;
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.fl_fragment_container, fragment).commit();
                return true;
            }
        });
    }
}