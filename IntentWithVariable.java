package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        ImageView chat=findViewById(R.id.chatGame1);
        ImageView chein=findViewById(R.id.chienGame);
        Intent in=new Intent(getApplicationContext(),RedirectVideo.class);
            chat.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("Hello i'm cat");
                    in.putExtra("choix","chat");
                    startActivity(in);
                    finish();
                }
            });


        chein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                in.putExtra("choix","chien");
                startActivity(in);
            }
        });

    }
}