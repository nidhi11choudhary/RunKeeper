package com.example.runkeeperapp;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        TextView pagination, highest_elevation, longest_run, fastest5k, fastest10k, half_marathon,
                marathon, virtual_half_marathon, tokya_hakone_ekiden, virtual_10k_race,
                hakone_ekiden, singapore_ekiden, virtual_5k_race ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        pagination = findViewById(R.id.pagination);
            pagination.setText("4 of 6");
        highest_elevation = findViewById(R.id.value_elevation);
            highest_elevation.setText("1095 ft");
        longest_run = findViewById(R.id.value_longestrun);
            longest_run.setText("10:12");
        fastest5k = findViewById(R.id.value_fastest5k);
            fastest5k.setText("01:00");
        fastest10k = findViewById(R.id.value_fastest10k);
            fastest10k.setText("02:20:00");
        half_marathon = findViewById(R.id.value_halfMarathon);
            half_marathon.setText("00:50");
        marathon = findViewById(R.id.value_marathon);
            marathon.setText("Not Yet");
        virtual_half_marathon = findViewById(R.id.value_vhmarathon);
            virtual_half_marathon.setText("05:05");
        tokya_hakone_ekiden = findViewById(R.id.value_tokyoHakone);
            tokya_hakone_ekiden.setText("04:01:02");
        virtual_10k_race = findViewById(R.id.value_virtual10k);
            virtual_10k_race.setText("00:10");
        hakone_ekiden = findViewById(R.id.value_hakEkiden);
            hakone_ekiden.setText("00:00:00");
        singapore_ekiden = findViewById(R.id.value_singapore);
            singapore_ekiden.setText("00:00:00");
        virtual_5k_race = findViewById(R.id.value_v5krace);
            virtual_5k_race.setText("23:07");
           }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}