package com.ragilayuningtyass.praktikumpbo.pertemuan3.RaraKlinik;

public class RaraKlinik {
    //Attribute
    private String NamaDokter, NamaPasien, Penyakit;
    private int Umur;
    
    //Constructor
    public RaraKlinik(String NamaDokter, String NamaPasien, String Penyakit, int Umur) {
        this.NamaDokter = NamaDokter;
        this.NamaPasien = NamaPasien;
        this.Penyakit = Penyakit;
        this.Umur = Umur;
    }
    
    //Method
    public void Tampilkan (){
        System.out.println("Nama Dokter: "+NamaDokter);
        System.out.println("Nama Pasien: " +NamaPasien);
        System.out.println("Penyakit yang Diderita: "+Penyakit);
        System.out.println("Umur: " +Umur+ " tahun");
    }
    public String getNamaDokter() {
        return NamaDokter;
    }

    public void setNamaDokter(String NamaDokter) {
        this.NamaDokter = NamaDokter;
    }

    public String getNamaPasien() {
        return NamaPasien;
    }

    public void setNamaPasien(String NamaPasien) {
        this.NamaPasien = NamaPasien;
    }

    public String getPenyakit() {
        return Penyakit;
    }

    public void setPenyakit(String Penyakit) {
        this.Penyakit = Penyakit;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }
    
}
