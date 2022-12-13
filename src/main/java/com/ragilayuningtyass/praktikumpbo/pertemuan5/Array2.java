package com.ragilayuningtyass.praktikumpbo.pertemuan5;

public class Array2 {
   public static void main(String[] args) {
        //pembuatan array
        String[] names= {"Dada","Didi","Dodo"}; //penulisan boleh memanjang ke bawah atau ke samping
        
        //Cek panjang array
        System.out.println("Panjang array: "+names.length);

        //menampilkan semua nilai array
        for(int i=0; i<names.length;i++){
            System.out.println(i+": "+names[i]);
        }
    } 
}
