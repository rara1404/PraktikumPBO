package com.ragilayuningtyass.praktikumpbo.pertemuan4.kendaraan;

public class Main {
    public static void main(String[] args) {
        //Pembuatan object
        //Class object= new Class()
        Mobil mb= new Mobil();
        Motor mt= new Motor();
        Kendaraan kn= new Kendaraan();
        
        //Memasukkan nilai attribute
        mb.nama="Mitsubishi";
        mb.jmlRoda=4;
        mb.maxGear=6;
        
        //Motor
       mt.nama="Scoopy";
       mt.jmlRoda=2;
       mt.jnsMotor="Matic";
        
        kn.nama="Kendaraan misterius";
        kn.jmlRoda=3;
        
        //Uji coba pemanggilan method
        mb.showInfo();
        mb.belok("Kanan");
        mb.belok();
        
        //Method Motor
        mt.showInfo();
        mt.warnaMotor("Putih");
        mt.warnaMotor();
        
        kn.showInfo();
    }
}
