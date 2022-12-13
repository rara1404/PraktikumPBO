package com.ragilayuningtyass.praktikumpbo.pertemuan5;

public class Array1 {
    public static void main(String[] args) {
        //pembuatan array
        String[] names= new String[5];
        
        //Cek panjang array
        System.out.println("Panjang array: "+names.length);
        
        //Memasukkan nilai ke array
        names[0]="Rara";
        names[1]="Riri";
        names[2]="Rere";
        
        //menampilkan semua nilai array
        for(int i=0; i<names.length;i++){
            System.out.println(i+": "+names[i]);
        }
    }
}
