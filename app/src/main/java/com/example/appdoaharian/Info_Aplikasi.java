package com.example.appdoaharian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Info_Aplikasi extends AppCompatActivity implements View.OnClickListener {

    TextView tvInfoApl;
    CardView cvInfoDev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info__aplikasi);

        tvInfoApl = (TextView) findViewById(R.id.text_infoAplikasi);

        tvInfoApl.setText("Aplikasi Doa Harian adalah aplikasi edukasi berbasis android yang "+
                "dibuat untuk memudahkan seseorang terutama anak usia dini dalam belajar menghafalkan " +
                "dan melafadzkan doa sehari-hari karena disertai suara / sound doa. " +
                "\n\n"+
                "Aplikasi Doa Harian memuat menu tentang doa, doa harian, penambah wawasan yang meliputi bacaan " +
                "ayat kursi, asmaul husna, rukun islam dan rukun iman. Juga memuat game quiz agar anak-anak"+
                "tidak jenuh ketika belajar menghafal doa harian."+
                "\n\n" +
                "Selain untuk memudahkan anak usia dini dalam menghafal dan melafadzkan doa sehari-hari, Aplikasi " +
                "Doa Harian juga dibuat untuk menyelesaikan Tugas Akhir / Skripsi Program Studi S1 Teknik Informatika."+
                "\n\n" +
                "Aplikasi Doa Harian dibuat oleh developer dengan menggunakan IDE Android Studio menggunakan bahasa " +
                "pemrograman Java dengan database SQLite. Aplikasi hanya bisa dijalankan di handphone / smartphone " +
                "dengan minimal API 22. "
        );

        cvInfoDev = (CardView)findViewById(R.id.CV_InfoDeveloper);
        cvInfoDev.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()){
            case R.id.CV_InfoDeveloper:
                i = new Intent(this,Info_Developer.class);
                startActivity(i);
                break;
        }
    }
}
