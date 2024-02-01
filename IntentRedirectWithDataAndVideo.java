package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

public class RedirectVideo extends AppCompatActivity {
ImageView imgRer;
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redirect_video);
        imgRer=findViewById(R.id.redicrectLast);
        VideoView ved=findViewById(R.id.videoViewlast);

        imgRer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(getApplicationContext(),MainVideo.class);
                startActivity(in);
            }
        });

        Intent intent = getIntent();
        String val = intent.getStringExtra("choix");

        if(val.equals("chien")){
            ved.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }else{
            ved.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.test);
            MediaController mediaController = new MediaController(this);
            mediaController.setAnchorView(videoView);
            videoView.setMediaController(mediaController);
            videoView.start();
        }

    }
}