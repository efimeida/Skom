package com.example.appdoaharian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Ashus_Item_Listview extends AppCompatActivity {

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getListAsmaulHusna() {
        return ListAsmaulHusna;
    }

    public void setListAsmaulHusna(String listAsmaulHusna) {
        ListAsmaulHusna = listAsmaulHusna;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getArab() {
        return Arab;
    }

    public void setArab(String arab) {
        Arab = arab;
    }

    public Ashus_Item_Listview(String no, String listAsmaulHusna, String description, String arab) {
        No = no;
        ListAsmaulHusna = listAsmaulHusna;
        Description = description;
        Arab = arab;
    }

    private String No;
    private String ListAsmaulHusna;
    private String Description;
    private String Arab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ashus__item__listview);
    }
}
