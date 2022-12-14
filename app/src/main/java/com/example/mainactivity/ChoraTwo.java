package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class ChoraTwo extends AppCompatActivity {

    ImageView backBtn;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_chora_two);

        //Hooks
        backBtn = findViewById(R.id.backBtn);


        //Set On Click Listener
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChoraTwo.super.onBackPressed();
            }
        });

    }
    //Music Stop
    // Stop Player
    private void stopPlayer() {

        if(mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void playChora(View view) {

        if(mediaPlayer != null)
        {
            stopPlayer();
        }

        mediaPlayer = MediaPlayer.create(this, R.raw.c_for_cap);
        mediaPlayer.start();

    }
}