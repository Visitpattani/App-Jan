package com.example.arahnaka.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by arahnaka on 6/13/2018.
 */

public class ActivityTravel extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Title");
        toolbar.setTitleTextColor(Color.CYAN);
        toolbar.setSubtitle("Subtitle");
        toolbar.setSubtitleTextColor(Color.MAGENTA);
        toolbar.setLogo(R.mipmap.ic_launcher);
        toolbar.setBackgroundColor(0xff2589BD);
        setSupportActionBar(toolbar);


        BottomNavigationView bottomNavigationView=(BottomNavigationView)findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        Intent intent0 = new Intent(ActivityTravel.this, MainActivity.class);
                        startActivity(intent0);

                        break;

                    case R.id.travelinfo:
                        break;

                    case R.id.plan:
                        Intent intent2 = new Intent(ActivityTravel.this, ActivityPlan.class);
                        startActivity(intent2);
                        break;

                    case R.id.map:
                        Intent intent3 = new Intent(ActivityTravel.this, ActivityMap.class);
                        startActivity(intent3);
                        break;


                }


                return false;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
