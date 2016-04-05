package com.example.negri.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button spotifyStreamerBtn;
    private Button scoresAppBtn;
    private Button libraryAppBtn;
    private Button buildItBiggerBtn;
    private Button xyzReaderBtn;
    private Button myOwnAppBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spotifyStreamerBtn = (Button) findViewById(R.id.btn_Spotify_Streamer);
        scoresAppBtn = (Button) findViewById(R.id.btn_scores_app);
        libraryAppBtn = (Button) findViewById(R.id.btn_library_app);
        buildItBiggerBtn = (Button) findViewById(R.id.btn_build_it_bigger);
        xyzReaderBtn = (Button) findViewById(R.id.btn_xyz_reader);
        myOwnAppBtn = (Button) findViewById(R.id.btn_my_own_app);
        setButtonActions();
    }

    private void setButtonActions(){

        spotifyStreamerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.spotify_streamer_mesage, Toast.LENGTH_LONG).show();
            }
        });
        scoresAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.scores_app_message, Toast.LENGTH_LONG).show();
            }
        });
        libraryAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.library_app_message, Toast.LENGTH_LONG).show();
            }
        });
        buildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.build_it_bigger_message, Toast.LENGTH_LONG).show();
            }
        });
        xyzReaderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.xyz_reader_message, Toast.LENGTH_LONG).show();
            }
        });
        myOwnAppBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.capstone_app_message, Toast.LENGTH_LONG).show();
            }
        });


    }
}
