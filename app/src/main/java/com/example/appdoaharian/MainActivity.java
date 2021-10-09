package com.example.appdoaharian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public CardView card1,card2,card3,card4,card5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        card1 = (CardView)findViewById(R.id.Tentang_Doa);
        card2 = (CardView)findViewById(R.id.Doa_Harian);
        card3 = (CardView)findViewById(R.id.Wawasan);
        card4 = (CardView)findViewById(R.id.Game_Quiz);
        card5 = (CardView)findViewById(R.id.Info_Aplikasi);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent a,i,u,e,o;

        switch (view.getId()){
            case R.id.Tentang_Doa :
                a = new Intent(this,Tentang_Doa.class);
                startActivity(a);
                break;
        }

        switch (view.getId()){
            case R.id.Doa_Harian :
                i = new Intent(this,Menu_Doa_Harian.class);
                startActivity(i);
                break;
        }
        switch (view.getId()){
            case R.id.Wawasan :
                u = new Intent(this,Tambah_Wawasan.class);
                startActivity(u);
                break;
        }
        switch (view.getId()){
            case R.id.Game_Quiz :
                e = new Intent(this,QuizHome.class);
                startActivity(e);
                break;
        }
        switch (view.getId()){
            case R.id.Info_Aplikasi :
                o = new Intent(this,Info_Aplikasi.class);
                startActivity(o);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Yakin Untuk Keluar Aplikasi ?");
        builder.setCancelable(true);
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void clickExit(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Yakin Untuk Keluar Aplikasi ?");
        builder.setCancelable(true);
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
