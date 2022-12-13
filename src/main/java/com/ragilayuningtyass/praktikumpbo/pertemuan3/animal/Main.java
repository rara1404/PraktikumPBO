package com.ragilayuningtyass.praktikumpbo.pertemuan3.animal;

public class Main {
    public static void main(String[] args) {
        //Membuat object dari class Animal
        Animal cat= new Animal("Miyu",3,"Black");
        Animal dog= new Animal("Pwety",4,"White");
        Animal pig= new Animal("Meong",5,"Pink");
        
        /*
        //Mengisi nilai attribute object 'cat'
        cat.nama= "Miyu";
        cat.umur=3;
        cat.warna="Hitam";
        
        //Mengisi nilai attribute object 'dog'
        dog.nama= "Winter";
        dog.umur=4;
        dog.warna="Putih";
        
        //Mengisi nilai attribute object 'pig'
        pig.nama= "Pigi";
        pig.umur=5;
        pig.warna="Pink";
        */
        
        //Memanggil method
        cat.showProfile();
        dog.showProfile();
        pig.showProfile();
        
        //Demo getter & setter
        System.out.println("Dogs name (before): "+dog.getNama());
        dog.setNama("Blacky");
        System.out.println("dogs name (after): "+dog.getNama());
    }
}
