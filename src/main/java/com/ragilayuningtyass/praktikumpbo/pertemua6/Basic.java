package com.ragilayuningtyass.praktikumpbo.pertemua6;

public class Basic {
    public static void main(String[] args) {
        //Membuat array isi 3
        int[] myNumbers= {1,2,3};
        
        //Uji coba print nilai array index ke-10
        try{
            System.out.println(myNumbers[10]);
        }
        //bisa menangkap 1 jenis exception
        catch(IndexOutOfBoundsException e){
            System.out.println("Array Tidak Sebesar Itu!");
        }
        System.out.println("Proses Selesai!");
    }
}
