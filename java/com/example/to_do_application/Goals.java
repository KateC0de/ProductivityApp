package com.example.to_do_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class Goals extends AppCompatActivity {

    String description;

    YouTubePlayerView ytPlayerView;
    EditText editText;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);

        ytPlayerView = findViewById(R.id.videoView);
        editText = findViewById(R.id.description);
        submitButton = findViewById(R.id.submit);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                description = editText.getText().toString();
                showToast(description);
            }
        });

        getLifecycle().addObserver(ytPlayerView);

        ytPlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(YouTubePlayer youTubePlayer) {
                String videoId = "zCyHGaDgdpA";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });


    }

    private void showToast(String text){
        Toast.makeText(Goals.this, text, Toast.LENGTH_SHORT).show();
    }
}