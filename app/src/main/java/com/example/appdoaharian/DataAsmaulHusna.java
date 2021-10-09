package com.example.appdoaharian;

public class DataAsmaulHusna {
    private String asmaulHusna;
    private String description;
    private Integer gambar;

    public String getAsmaulHusna() {
        return asmaulHusna;
    }

    public void setAsmaulHusna(String asmaulHusna) {
        this.asmaulHusna = asmaulHusna;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGambar() {
        return gambar;
    }

    public void setGambar(Integer gambar) {
        this.gambar = gambar;
    }

    public DataAsmaulHusna(String asmaulHusna, String description, Integer gambar) {
        this.asmaulHusna = asmaulHusna;
        this.description = description;
        this.gambar = gambar;
    }
}
