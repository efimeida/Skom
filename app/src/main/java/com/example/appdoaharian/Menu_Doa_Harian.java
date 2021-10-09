package com.example.appdoaharian;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_Doa_Harian extends AppCompatActivity implements View.OnClickListener{

    public CardView CV1,CV2,CV3,CV4,CV5,CV6,CV7,CV8,CV9;
    public CardView CV10,CV11,CV12,CV13,CV14,CV15,CV16,CV17;
    public CardView CV18,CV19,CV20,CV21,CV22,CV23,CV24,CV25;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__doa__harian);

        CV1 = (CardView)findViewById(R.id.CV_Sebelum_Makan);
        CV2 = (CardView)findViewById(R.id.CV_Sesudah_Makan);
        CV3 = (CardView)findViewById(R.id.CV_Lupa_DoaMakan);
        CV4 = (CardView)findViewById(R.id.CV_Masuk_Kmr_Mandi);
        CV5 = (CardView)findViewById(R.id.CV_Keluar_Kmr_Mandi);
        CV6 = (CardView)findViewById(R.id.CV_Sebelum_Tidur);
        CV7 = (CardView)findViewById(R.id.CV_Bangun_Tidur);
        CV8 = (CardView)findViewById(R.id.CV_Susah_Tidur);
        CV9 = (CardView)findViewById(R.id.CV_Saat_Mimpi_Buruk);
        CV10 = (CardView)findViewById(R.id.CV_Ampunan_Orangtua);
        CV11 = (CardView)findViewById(R.id.CV_Saat_Bercermin);
        CV12 = (CardView)findViewById(R.id.CV_Memakai_Pakaian);
        CV13 = (CardView)findViewById(R.id.CV_Memakai_PakaianBaru);
        CV14 = (CardView)findViewById(R.id.CV_Melepas_Pakaian);
        CV15 = (CardView)findViewById(R.id.CV_Masuk_Rumah);
        CV16 = (CardView)findViewById(R.id.CV_Keluar_Rumah);
        CV17 = (CardView)findViewById(R.id.CV_Ketika_Bersedekah);
        CV18 = (CardView)findViewById(R.id.CV_Dijauhkan_Lupa);
        CV19 = (CardView)findViewById(R.id.CV_Masuk_Masjid);
        CV20 = (CardView)findViewById(R.id.CV_Keluar_Masjid);
        CV21 = (CardView)findViewById(R.id.CV_Ketika_Bersin);
        CV22 = (CardView)findViewById(R.id.CV_Akan_Belajar);
        CV23 = (CardView)findViewById(R.id.CV_Selesai_Belajar);
        CV24 = (CardView)findViewById(R.id.CV_Naik_Kendaraan);
        CV25 = (CardView)findViewById(R.id.CV_Turun_Hujan);

        CV1.setOnClickListener(this);
        CV2.setOnClickListener(this);
        CV3.setOnClickListener(this);
        CV4.setOnClickListener(this);
        CV5.setOnClickListener(this);
        CV6.setOnClickListener(this);
        CV7.setOnClickListener(this);
        CV8.setOnClickListener(this);
        CV9.setOnClickListener(this);
        CV10.setOnClickListener(this);
        CV11.setOnClickListener(this);
        CV12.setOnClickListener(this);
        CV13.setOnClickListener(this);
        CV14.setOnClickListener(this);
        CV15.setOnClickListener(this);
        CV16.setOnClickListener(this);
        CV17.setOnClickListener(this);
        CV18.setOnClickListener(this);
        CV19.setOnClickListener(this);
        CV20.setOnClickListener(this);
        CV21.setOnClickListener(this);
        CV22.setOnClickListener(this);
        CV23.setOnClickListener(this);
        CV24.setOnClickListener(this);
        CV25.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14;
        Intent i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25;

        switch (view.getId()){
            case R.id.CV_Sebelum_Makan:
                i1 = new Intent(this,D_Sebelum_Makan.class);
                startActivity(i1);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Sesudah_Makan:
                i2 = new Intent(this,D_Sesudah_Makan.class);
                startActivity(i2);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Lupa_DoaMakan:
                i3 = new Intent(this,D_Lupa_Doa_Makan.class);
                startActivity(i3);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Masuk_Kmr_Mandi:
                i4 = new Intent(this,D_Masuk_KmrMandi.class);
                startActivity(i4);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Keluar_Kmr_Mandi:
                i5 = new Intent(this,D_Keluar_KmrMandi.class);
                startActivity(i5);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Sebelum_Tidur:
                i6 = new Intent(this,D_Sebelum_Tidur.class);
                startActivity(i6);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Bangun_Tidur:
                i7 = new Intent(this,D_Bangun_Tidur.class);
                startActivity(i7);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Susah_Tidur:
                i8 = new Intent(this,D_Susah_Tidur.class);
                startActivity(i8);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Saat_Mimpi_Buruk:
                i9 = new Intent(this,D_Saat_Mimpi_Buruk.class);
                startActivity(i9);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Ampunan_Orangtua:
                i10 = new Intent(this,D_Ampunan_Orang_Tua.class);
                startActivity(i10);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Saat_Bercermin:
                i11 = new Intent(this,D_Bercermin.class);
                startActivity(i11);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Memakai_Pakaian:
                i12 = new Intent(this,D_Memakai_Pkaian.class);
                startActivity(i12);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Memakai_PakaianBaru:
                i13 = new Intent(this,D_Mmkai_PkaianBaru.class);
                startActivity(i13);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Melepas_Pakaian:
                i14 = new Intent(this,D_Melepas_Pkaian.class);
                startActivity(i14);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Masuk_Rumah:
                i15 = new Intent(this,D_Masuk_Rumah.class);
                startActivity(i15);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Keluar_Rumah:
                i16 = new Intent(this,D_Keluar_Rumah.class);
                startActivity(i16);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Ketika_Bersedekah:
                i17 = new Intent(this,D_Bersedekah.class);
                startActivity(i17);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Dijauhkan_Lupa:
                i18 = new Intent(this,D_Dijauhkan_Lupa.class);
                startActivity(i18);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Masuk_Masjid:
                i19 = new Intent(this,D_Masuk_Masjid.class);
                startActivity(i19);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Keluar_Masjid:
                i20 = new Intent(this,D_Keluar_Masjid.class);
                startActivity(i20);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Ketika_Bersin:
                i21 = new Intent(this,D_Bersin.class);
                startActivity(i21);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Akan_Belajar:
                i22 = new Intent(this,D_Akan_Belajar.class);
                startActivity(i22);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Selesai_Belajar:
                i23 = new Intent(this,D_Selesai_Belajar.class);
                startActivity(i23);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Naik_Kendaraan:
                i24 = new Intent(this,D_Naik_Kendaraan.class);
                startActivity(i24);
                break;
        }
        switch (view.getId()){
            case R.id.CV_Turun_Hujan:
                i25 = new Intent(this,D_Turun_Hujan.class);
                startActivity(i25);
                break;
        }
    }
}
