package com.example.appdoaharian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Ayat_Kursi extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
    TextView tvAyatKursi;
    ImageButton play;
    ImageButton pause;
    ImageButton stop;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayat__kursi);

        play = (ImageButton) findViewById(R.id.play);
        pause = (ImageButton) findViewById(R.id.pause);
        stop = (ImageButton) findViewById(R.id.stop);

        tvAyatKursi = (TextView) findViewById(R.id.text_ayatkursi);

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

        tvAyatKursi.setText("بِسْــــــــــــــــــمِ اللهِ الرَّحْمَنِ الرَّحِيْمِ"+
                "\n\n"+
                "ٱللَّهُ لَآ إِلَٰهَ إِلَّا هُوَ ٱلْحَىُّ ٱلْقَيُّومُ ۚ لَا تَأْخُذُهُۥ سِنَةٌ وَلَا نَوْمٌ ُۚ" +
                " لَّهُۥ مَا فِى ٱلسَّمَٰوَٰتِ وَمَا فِى ٱلْأَرْضِ ۗ مَن ذَا ٱلَّذِى يَشْفَعُ عِندَهُۥٓ إِلَّا بِإِذْنِهِۦ ۚ" +
                " يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ ۖ وَلَا يُحِيطُونَ بِشَىْءٍ مِّنْ عِلْمِهِۦٓ إِلَّا بِمَا شَآءَ ۚ " +
                "وَسِعَ كُرْسِيُّهُ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضَ ۖ وَلَا يَـُٔودُهُۥ حِفْظُهُمَا ۚ وَهُوَ ٱلْعَلِىُّ ٱلْعَظِيم" +
                "\n\n" +
                "Allahu laa ilaaha ila huwal hayyul qayyumu. Laa ta’khudzuhuu sinatuw wa laa nauum. " +
                "Lahuu maa fissamaawaati wa maa fil ardhi. Man dzal ladzii yasfa’u ‘indahu " +
                "illa bi idznihi. Ya’lamu maa baina aidiihim wa maa khalfahum. Wa laa yuhithuuna " +
                "bi syai’in min ‘ilmihii illaa bi maasyaa-a. Wasi’a kursiyyuhussamaawaati wal’ardha. " +
                "Wa laa ya’udhuu hifzhuhumaa wahuwal ‘aliyyul azhiim." +
                "\n\n" +
                "Artinya:" +
                "\n" +
                "Allah, tidak ada Tuhan (yang berhak disembah) melainkan Dia Yang Hidup kekal lagi terus " +
                "menerus mengurus (makhluk-Nya); tidak mengantuk dan juga tidak tidur. Kepunyaan-Nya " +
                "apa yang di langit dan di bumi. Tiada yang mampu memberi syafaat di sisi Allah " +
                "tanpa seizin-Nya. Allah mengetahui apa-apa yang di hadapan mereka dan di belakang " +
                "mereka, dan mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang " +
                "dikehendaki-Nya. Kursi Allah mencakup langit dan bumi. Dan Allah tidak merasa berat " +
                "memelihara keduanya dan Allah Maha Tinggi lagi Maha Besar."
        );
    }

    private void setup() {
        loadClip();
        play.setEnabled(true);
        pause.setEnabled(false);
        stop.setEnabled(false);
    }

    private void loadClip() {
        try {
            mp=MediaPlayer.create(this, R.raw.b_ayat_kursi);
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
