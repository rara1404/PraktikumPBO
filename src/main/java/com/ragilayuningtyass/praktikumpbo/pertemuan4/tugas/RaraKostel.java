package com.ragilayuningtyass.praktikumpbo.pertemuan4.tugas;

public class RaraKostel {
    //Attribute
    String namaPemesan, tipeKamar;
    int noKamar;
    
    //Method
    public void disewakan(int hari){
            System.out.println("Kamar "+noKamar+" telah disewakan selama "+hari+ " hari");
    }
    
    public void tampilkan(){
        System.out.println("Nama Pemesan: "+namaPemesan);
        System.out.println("Tipe Kamar: "+tipeKamar);
        System.out.println("No Kamar: " +noKamar);
        tambahan();
    }
    
    public void tambahan(){}
}
