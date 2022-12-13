package com.ragilayuningtyass.praktikumpbo.pertemuan3.RaraKlinik;

public class MainKlinik {
    public static void main(String[] args) {
        RaraKlinik Ahmad= new RaraKlinik("dr. Dewi", "Ahmad", "Demam", 19);
        RaraKlinik Chava= new RaraKlinik("dr. Budi", "Chava", "Pusing", 28);
        
        Ahmad.Tampilkan();
        Chava.Tampilkan();
        
        System.out.println("Diagnosis Penyakit: " +Ahmad.getPenyakit());
        Ahmad.setPenyakit("Tipes");
        System.out.println("Penyakit Sebenarnya: " +Ahmad.getPenyakit());
        
    }
}
