package com.example.epdamian;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class videoinstitucional extends AppCompatActivity {

    //--------VIDEO-------

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoinstitucional);
        VideoView videoView = findViewById(R.id.video_view);

        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.scrum;

        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}