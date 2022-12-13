package com.ragilayuningtyass.praktikumpbo.pertemuan4.kendaraan;

public class Motor extends Kendaraan{
    String jnsMotor;
    
    public void warnaMotor(String warna){
        System.out.println("Motor ini berwana: "+warna);
    }
    public void warnaMotor(){
        System.out.println("Motor tidak berwarna!");
    }
    public void extraInfo(){
        System.out.println("Jenis Motor: "+jnsMotor);
    }
}
