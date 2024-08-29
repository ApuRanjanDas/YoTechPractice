package com.example.yotechpractice.mediaplayer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.yotechpractice.R;

public class MediaPlayerActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton playButton, pauseButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        playButton = findViewById(R.id.playbuttonID);
        pauseButton = findViewById(R.id.pausebuttonID);

        mediaPlayer = MediaPlayer.create(this, R.raw.android_video);

        playButton.setOnClickListener(this);
        pauseButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.playbuttonID){
            if (mediaPlayer!=null){
                mediaPlayer.start();

                int duration = mediaPlayer.getDuration()/1000;

                Toast.makeText(MediaPlayerActivity.this,"Song Start and duration "+duration,Toast.LENGTH_SHORT).show();
            }
        }


        if (v.getId()==R.id.pausebuttonID){
            if (mediaPlayer!=null){
                mediaPlayer.pause();
                Toast.makeText(MediaPlayerActivity.this,"Song Paused!",Toast.LENGTH_SHORT).show();
            }
        }
    }



//App theke back korle song off hobe
//    @Override
//    protected void onDestroy() {
//        if (mediaPlayer!=null && mediaPlayer.isPlaying()){
//            mediaPlayer.stop();
//            mediaPlayer.release();
//            mediaPlayer=null;
//        }
//
//        super.onDestroy();
//    }
}