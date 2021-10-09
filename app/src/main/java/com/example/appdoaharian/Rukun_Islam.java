package com.example.appdoaharian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Rukun_Islam extends AppCompatActivity implements MediaPlayer.OnCompletionListener{

    ImageButton play;
    ImageButton pause;
    ImageButton stop;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rukun__islam);

        play=(ImageButton)findViewById(R.id.play);
        pause=(ImageButton)findViewById(R.id.pause);
        stop=(ImageButton)findViewById(R.id.stop);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                play();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pause();
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stop();
            }
        });
        setup();
    }
    private void setup() {
        loadClip();
        play.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(false);
    }

    private void loadClip() {
        try {
            mp=MediaPlayer.create(this, R.raw.b_rukun_islam);
            mp.setOnCompletionListener(this);
        }
        catch (Throwable t){
            goBlooey(t);
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();

        if (stop.isEnabled()){
            stop();
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        stop();

    }

    private void play(){
        mp.start();

        play.setEnabled(false);
        pause.setEnabled(true);
        stop.setEnabled(true);
    }

    private void stop(){
        mp.stop();
        pause.setEnabled(false);
        stop.setEnabled(false);

        try {
            mp.prepare();
            mp.seekTo(0);
            play.setEnabled(true);
        }
        catch (Throwable t){
            goBlooey(t);
        }
    }

    private void pause(){
        mp.pause();

        play.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(true);
    }

    private void goBlooey(Throwable t) {
        AlertDialog.Builder builder = new
                AlertDialog.Builder(this);

        builder
                .setTitle("Exception !")
                .setMessage(t.toString())
                .setPositiveButton("OK", null)
                .show();
    }

}
