package com.techwork.kjc.test;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String uriPath = "android.resource://" + getPackageName() + "/raw/video";

        Uri uri = Uri.parse(uriPath);


        final VideoView videoView = (VideoView)findViewById(R.id.videoView);

        videoView.setVideoURI(uri);
        final MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);

        videoView.start();


    }
}
