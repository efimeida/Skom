package com.example.appdoaharian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class Tentang_Doa extends AppCompatActivity {
    TextView tvDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang__doa);

        tvDeskripsi = (TextView)findViewById(R.id.textview2);

        tvDeskripsi.setText("Doa dalam pengertian “permintaan” atau “permohonan” disebutkan "+
                "dalam Al-Quran surah Al-Mu’minun ayat 60 yaitu: "+
                "\n\n"+
                "وَقَالَ رَبُّكُمُ ٱدْعُونِىٓ أَسْتَجِبْ لَكُمْ ۚ إِنَّ ٱلَّذِينَ يَسْتَكْبِرُونَ عَنْ عِبَادَتِى سَيَدْخُلُونَ جَهَنَّمَ دَاخِرِينَ"+
                "\n\n"+
                "Artinya: Dan Tuhanmu berfirman, 'Berdoalah kepada-Ku, "+
                "niscaya akan kuperkenankan bagimu. Sesungguhnya orang-orang "+
                "yang menyombongkan diri dari menyembah-Ku akan masuk neraka jahannam "+
                "dalam keadaan hina dina.'"+
                "\n\n"+
                "Doa merupakan ucapan permohonan dan pujian kepada Allah dengan cara-cara tertentu "+
                "dan disertai dengan kerendahan hati untuk mendapatkan kebaikan yang ada disisi-Nya "+
                "dan untuk memudahkan segala aktifitas agar menjadi lebih bermanfaat dan berkah. "+
                "Sedangkan doa harian adalah doa-doa yang biasa diucapkan ketika melakukan "+
                "atau setelah selesai mengerjakan sesuatu (Afriansyah,2018)."+
                "\n\n"+
                "Dan Doa harian juga merupakan membiasakan diri mengucapan permohonan doa kepada Allah ketika "+
                "hendak atau setelah selesai melakukan sesuatu agar aktifitas menjadi lebih bermanfaat dan berkah. ");


    }
}
