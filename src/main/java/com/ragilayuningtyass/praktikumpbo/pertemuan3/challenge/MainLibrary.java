package com.ragilayuningtyass.praktikumpbo.pertemuan3.challenge;

public class MainLibrary {
    public static void main(String[] args) {
        Library rara= new Library("Rara",2,3);
        Library tata= new Library("Tata",3,4);
        
        rara.showProfile();
        tata.showProfile();
        System.out.println("Nama Asli: " +tata.getName());
        tata.setName("Rani");
        System.out.println("Perubahan nama: "+tata.getName());
        
    }
  
}
