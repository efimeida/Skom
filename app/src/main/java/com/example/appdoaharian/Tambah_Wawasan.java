package com.example.appdoaharian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Tambah_Wawasan extends AppCompatActivity implements View.OnClickListener{

    public CardView cardView1,cardView2,cardView3,cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah__wawasan);

        cardView1 = (CardView)findViewById(R.id.CV_Ayat_Kursi);
        cardView2 = (CardView)findViewById(R.id.CV_Asmaul_Husna);
        cardView3 = (CardView)findViewById(R.id.CV_Rukun_Islam);
        cardView4 = (CardView)findViewById(R.id.CV_Rukun_Iman);

        cardView1.setOnClickListener(this);
        cardView2.setOnClickListener(this);
        cardView3.setOnClickListener(this);
        cardView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent a,i,u,e;

        switch (v.getId()){
            case R.id.CV_Ayat_Kursi:
                a = new Intent(this,Ayat_Kursi.class);
                startActivity(a);
                break;
        }
        switch (v.getId()){
            case R.id.CV_Asmaul_Husna:
                i = new Intent(this,Asmaul_Husna.class);
                startActivity(i);
                break;
        }
        switch (v.getId()){
            case R.id.CV_Rukun_Islam:
                u = new Intent(this,Rukun_Islam.class);
                startActivity(u);
                break;
        }
        switch (v.getId()){
            case R.id.CV_Rukun_Iman:
                e = new Intent(this,Rukun_Iman.class);
                startActivity(e);
                break;
        }
    }
}
