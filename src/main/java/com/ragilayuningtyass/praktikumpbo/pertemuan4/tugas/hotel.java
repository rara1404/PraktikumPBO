package com.ragilayuningtyass.praktikumpbo.pertemuan4.tugas;

public class hotel extends RaraKostel {
    String sarapan;
    
    public void pembersihanKamar (String bersih){
        System.out.println("Layanan pembersihan kamar: "+bersih);
    }
    
    public void pembersihanKamar(){
        System.out.println("Tidak Ada Info");
    }
    
    public void tambahan(){
        System.out.println("Sarapan: "+sarapan);
    }
}
