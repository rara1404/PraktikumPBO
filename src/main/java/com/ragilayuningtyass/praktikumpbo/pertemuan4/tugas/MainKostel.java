package com.ragilayuningtyass.praktikumpbo.pertemuan4.tugas;

import java.util.Scanner;

public class MainKostel {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char ulang;
        do{
            System.out.println("Menu Pemesanan RaraKostel");
            System.out.println("1. Kost");
            System.out.println("2. Hotel");
            System.out.print("Masukkan pilihan kamar: ");
            int pil= input.nextInt();

        switch (pil){
            case 1:
                kost ks= new kost ();
                
                //Nilai attribute
                ks.namaPemesan= "Lee Min Ho";
                ks.tipeKamar= "Large";
                ks.noKamar= 14;
                ks.kmrMandi="Dalam";
                
                //Method
                ks.tampilkan();
                ks.disewakan(30);
                ks.pembayaran(6);
                ks.pembayaran();
            break;
            case 2:
                hotel ht= new hotel();
                
                //Nilai attribute
                ht.namaPemesan= "DO";
                ht.tipeKamar="Superior";
                ht.noKamar= 21;
                ht.sarapan= "Ya";
                
                //Method
                ht.tampilkan();
                ht.disewakan(3);
                ht.pembersihanKamar("dibersihkan");
                ht.pembersihanKamar();
            break;
            default:
                System.out.println("Error: Tidak ada pada menu!");
        }
        System.out.print("Ingin memilih menu lain (y/t)? ");
        ulang = input.next().charAt(0);
    }while (ulang != 't');
        System.out.println("Terimakasih!!");
  }
}
