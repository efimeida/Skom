package com.example.appdoaharian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;

public class Asmaul_Husna extends AppCompatActivity implements SearchView.OnQueryTextListener, MediaPlayer.OnCompletionListener {

    private RecyclerView rvList;
    private RecyclerAdapter adapter;
    private ArrayList<Ashus_Item_Listview> item;
    private SearchView sv_Search;

    ImageButton play;
    ImageButton pause;
    ImageButton stop;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asmaul__husna);

        getItems();
        rvList = findViewById(R.id.rvListDoa);

        sv_Search = findViewById(R.id.svSearch);

        adapter = new RecyclerAdapter(item);

        RecyclerView.LayoutManager layoutManager = new  LinearLayoutManager(Asmaul_Husna.this);

        rvList.setLayoutManager(layoutManager);

        rvList.setAdapter(adapter);

        sv_Search.setOnQueryTextListener(this);


        play = (ImageButton) findViewById(R.id.play);
        pause = (ImageButton) findViewById(R.id.pause);
        stop = (ImageButton) findViewById(R.id.stop);

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
    public void getItems(){
        item = new ArrayList<>();
        item.add(new Ashus_Item_Listview("","Allah","Allah","الله"));
        item.add(new Ashus_Item_Listview("1","Ar Rahman","Yang Maha Pengasih","الرحمن"));
        item.add(new Ashus_Item_Listview("2","Ar Rahiim","Yang Maha Penyayang","الرحيم"));
        item.add(new Ashus_Item_Listview("3","Al Malik","Yang Maha Merajai/Memerintah","الملك"));
        item.add(new Ashus_Item_Listview("4","Al Qudus","Yang Maha Suci","القدوس"));
        item.add(new Ashus_Item_Listview("5","As Salaam","Yang Maha Memberi Kesejahteraan","السلام"));
        item.add(new Ashus_Item_Listview("6","Al Mu'min","Yang Maha Memberi Keamanan","المؤمن"));
        item.add(new Ashus_Item_Listview("7","Al Muhaimin","Yang Maha Mengatur","المهيمن"));
        item.add(new Ashus_Item_Listview("8","Al Aziiz","Yang Maha Perkasa","العزيز"));
        item.add(new Ashus_Item_Listview("9","Al Jabbar","Yang Memiliki Mutlak Kegagahan","الجبار"));
        item.add(new Ashus_Item_Listview("10","Al Mutakabbir","Yang Maha Memiliki Megah","المتكبر"));
        item.add(new Ashus_Item_Listview("11","Al Khaliq","Yang Maha Pencipta","الخالق"));
        item.add(new Ashus_Item_Listview("12","Al Baari'","Yang Maha Melepaskan","البارئ"));
        item.add(new Ashus_Item_Listview("13","Al Mushawwir","Yang Maha Membentuk Rupa","المصور"));
        item.add(new Ashus_Item_Listview("14","Al Ghaffar","Yang Maha Pengampun","الغفار"));
        item.add(new Ashus_Item_Listview("15","Al Qahhar","Yang Maha Menundukkan","القهار"));
        item.add(new Ashus_Item_Listview("16","Al Wahhaab","Yang Maha Pemberi Karunia","الوهاب"));
        item.add(new Ashus_Item_Listview("17","Ar Razzaaq","Yang Maha Pemberi Rezeki","الرزاق"));
        item.add(new Ashus_Item_Listview("18","Al Fattaah","Yang Maha Pembuka Rahmat","الفتاح"));
        item.add(new Ashus_Item_Listview("19","Al Aliim","Yang Maha Mengetahui","العليم"));
        item.add(new Ashus_Item_Listview("20","Al Qaabidh","Yang Maha Menyempitkan","القابض"));
        item.add(new Ashus_Item_Listview("21","Al Baasith","Yang Maha Melapangkan","الباسط"));
        item.add(new Ashus_Item_Listview("22","Al Khaafidh","Yang Maha Merendahkan","الخافض"));
        item.add(new Ashus_Item_Listview("23","Ar Raafi'","Yang Maha Meninggikan","الرافع"));
        item.add(new Ashus_Item_Listview("24","Al Mu'izz","Yang Maha Memuliakan","المعز"));
        item.add(new Ashus_Item_Listview("25","Al Mudzil","Yang Maha Menghinakan","المذل"));
        item.add(new Ashus_Item_Listview("26","Al Samii'","Yang Maha Mendengar","السميع"));
        item.add(new Ashus_Item_Listview("27","Al Bashiir","Yang Maha Melihat","البصير"));
        item.add(new Ashus_Item_Listview("28","Al Hakam","Yang Maha Menetapkan","الحكم"));
        item.add(new Ashus_Item_Listview("29","Al 'Adl","Yang Maha Adil","العدل"));
        item.add(new Ashus_Item_Listview("30","Al Lathiif","Yang Maha Lembut","اللطيف"));
        item.add(new Ashus_Item_Listview("31","Al Khabiir","Yang Maha Mengenal","الخبير"));
        item.add(new Ashus_Item_Listview("32","Al Haliim","Yang Maha Penyantun","الحليم"));
        item.add(new Ashus_Item_Listview("33","Al 'Azhiim","Yang Maha Agung","العظيم"));
        item.add(new Ashus_Item_Listview("34","Al Ghafuur","Yang Maha Memberi Pengampunan","الغفور"));
        item.add(new Ashus_Item_Listview("35","As Syakuur","Yang Maha Pembalas Budi","الشكور"));
        item.add(new Ashus_Item_Listview("36","Al 'Aliy","Yang Maha Tinggi","العلى"));
        item.add(new Ashus_Item_Listview("37","Al Kabiir","Yang Maha Besar","الكبير"));
        item.add(new Ashus_Item_Listview("38","Al Hafizh","Yang Maha Memelihara","الحفيظ"));
        item.add(new Ashus_Item_Listview("39","Al Muqiit","Yang Maha Pemberi Kecukupan","المقيت"));
        item.add(new Ashus_Item_Listview("40","Al Hasiib","Yang Maha Membuat Perhitungan","الحسيب"));
        item.add(new Ashus_Item_Listview("41","Al Jaliil","Yang Maha Luhur","الجليل"));
        item.add(new Ashus_Item_Listview("42","Al Kariim","Yang Maha Pemurah","الكريم"));
        item.add(new Ashus_Item_Listview("43","Ar Raqiib","Yang Maha Mengawasi","الرقيب"));
        item.add(new Ashus_Item_Listview("44","Al Mujiib","Yang Maha Mengabulkan","المجيب"));
        item.add(new Ashus_Item_Listview("45","Al Waasi'","Yang Maha Luas","الواسع"));
        item.add(new Ashus_Item_Listview("46","Al Hakim","Yang Maha Bijaksana","الحكيم"));
        item.add(new Ashus_Item_Listview("47","Al Waduud","Yang Maha Mengasihi","الودود"));
        item.add(new Ashus_Item_Listview("48","Al Majiid","Yang Maha Mulia","المجيد"));
        item.add(new Ashus_Item_Listview("49","Al Baa'its","Yang Maha Membangkitkan","الباعث"));
        item.add(new Ashus_Item_Listview("50","As Syahiid","Yang Maha Menyaksikan","لشهيد"));
        item.add(new Ashus_Item_Listview("51","Al Haqq","Yang Maha Benar","الحق"));
        item.add(new Ashus_Item_Listview("52","Al Wakiil","Yang Maha Memelihara","الوكيل"));
        item.add(new Ashus_Item_Listview("53","Al Qawiyyu","Yang Maha Kuat","القوى"));
        item.add(new Ashus_Item_Listview("54","Al Matiin","Yang Maha Kokoh","المتين"));
        item.add(new Ashus_Item_Listview("55","Al Waliyy","Yang Maha Melindungi","الولى"));
        item.add(new Ashus_Item_Listview("56","Al Hamiid","Yang Maha Terpuji","الحميد"));
        item.add(new Ashus_Item_Listview("57","Al Muhshii","Yang Maha Mengalkulasi","المحصى"));
        item.add(new Ashus_Item_Listview("58","Al Mubdi'","Yang Maha Memulai","المبدئ"));
        item.add(new Ashus_Item_Listview("59","Al Mu'iid","Yang Maha Mengembalikan Kehidupan","المعيد"));
        item.add(new Ashus_Item_Listview("60","Al Muhyii","Yang Maha Menghidupkan","المحيى"));
        item.add(new Ashus_Item_Listview("61","Al Mumiitu","Yang Maha Mematikan","المميت"));
        item.add(new Ashus_Item_Listview("62","Al Hayyu","Yang Maha Hidup","الحي"));
        item.add(new Ashus_Item_Listview("63","Al Qayyuum","Yang Maha Mandiri","القيوم"));
        item.add(new Ashus_Item_Listview("64","Al Waajid","Yang Maha Penemu","الواجد"));
        item.add(new Ashus_Item_Listview("65","Al Maajid","Yang Maha Mulia","الماجد"));
        item.add(new Ashus_Item_Listview("66","Al Wahid","Yang Maha Tunggal","الواحد"));
        item.add(new Ashus_Item_Listview("67","Al Ahad","Yang Maha Esa","الاحد"));
        item.add(new Ashus_Item_Listview("68","As Shamad","Yang Maha Dibutuhkan, Tempat Meminta","الصمد"));
        item.add(new Ashus_Item_Listview("69","Al Qaadir","Yang Maha Menentukan","القادر"));
        item.add(new Ashus_Item_Listview("70","Al Muqtadir","Yang Maha Berkuasa","المقتدر"));
        item.add(new Ashus_Item_Listview("71","Al Muqaddim","Yang Maha Mendahulukan","المقدم"));
        item.add(new Ashus_Item_Listview("72","Al Mu'akkhir","Yang Maha Mengakhirkan","المؤخر"));
        item.add(new Ashus_Item_Listview("73","Al Awwal","Yang Maha Awal","الأول"));
        item.add(new Ashus_Item_Listview("74","Al Aakhir","Yang Maha Akhir","الأخر"));
        item.add(new Ashus_Item_Listview("75","Az Zhaahir","Yang Maha Nyata","الظاهر"));
        item.add(new Ashus_Item_Listview("76","Al Baathin","Yang Maha Ghaib","الباطن"));
        item.add(new Ashus_Item_Listview("77","Al Waali","Yang Maha Memerintah","الوالي"));
        item.add(new Ashus_Item_Listview("78","Al Muta 'aalii","Yang Maha Tinggi","المتعالي"));
        item.add(new Ashus_Item_Listview("79","Al Barru","Yang Maha Pemberi Kebajikan","البر"));
        item.add(new Ashus_Item_Listview("80","At Tawwaab","Yang Maha Penerima Taubat","التواب"));
        item.add(new Ashus_Item_Listview("81","Al Muntaqim","Yang Maha Pemberi Balasan","المنتقم"));
        item.add(new Ashus_Item_Listview("82","Al Afuww","Yang Maha Pemaaf","العفو"));
        item.add(new Ashus_Item_Listview("83","Ar Ra'uuf'","Yang Maha Pengasuh","الرؤوف"));
        item.add(new Ashus_Item_Listview("84","Malikul Mulk","Yang Maha Penguasa Semesta","مالك الملك"));
        item.add(new Ashus_Item_Listview("85","Dzul Jalaali Wal Ikhraam","Yang Maha Pemilik Kebesaran dan Kemuliaan","ذو الجلال و الإكرام"));
        item.add(new Ashus_Item_Listview("86","Al Muqsith","Yang Maha Pemberi Keadilan","المقسط"));
        item.add(new Ashus_Item_Listview("87","Al Jamii'","Yang Maha Mengumpulkan","الجامع"));
        item.add(new Ashus_Item_Listview("88","Al Ghaniyy","Yang Maha Kaya","الغنى"));
        item.add(new Ashus_Item_Listview("89","Al Mughnii","Yang Maha Pemberi Kekayaan","المغنى"));
        item.add(new Ashus_Item_Listview("90","Al Maani","Yang Maha Mencegah","المانع"));
        item.add(new Ashus_Item_Listview("91","Ad Dhaar","Yang Maha Penimpa Kemudharatan","الضار"));
        item.add(new Ashus_Item_Listview("92","An Nafii'","Yang Maha Memberi Manfaat","النافع"));
        item.add(new Ashus_Item_Listview("93","An Nuur","Yang Maha Bercahaya","لنور"));
        item.add(new Ashus_Item_Listview("94","Al Haadii","Yang Maha Pemberi Petunjuk","الهادئ"));
        item.add(new Ashus_Item_Listview("95","Al Badii'","Yang Maha Pencipta Yang Tiada Bandingannya","البديع"));
        item.add(new Ashus_Item_Listview("96","Al Baaqii","Yang Maha Kekal","الباقي"));
        item.add(new Ashus_Item_Listview("97","Al Waarits","Yang Maha Pewaris","الوارث"));
        item.add(new Ashus_Item_Listview("98","Ar Rasyiid","Yang Maha Pandai","الرشيد"));
        item.add(new Ashus_Item_Listview("99","As Shabuur","Yang Maha Sabar","الصبور"));
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        adapter.filter(s);
        return false;
    }


    private void setup() {
        loadClip();
        play.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(false);
    }

    private void loadClip() {
        try {
            mp=MediaPlayer.create(this, R.raw.asmaul_husna);
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
    @Override
    public void onCompletion(MediaPlayer mp) {
        stop();
    }

}
