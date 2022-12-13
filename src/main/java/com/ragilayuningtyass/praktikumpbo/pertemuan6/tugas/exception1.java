package com.ragilayuningtyass.praktikumpbo.pertemuan6.tugas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
      try{
        Scanner input= new Scanner(System.in);
        System.out.println("--Menu Kantin --");
        System.out.println("1. Magelangan");
        System.out.println("2. Indomie");
        System.out.println("3. Bakso");
        System.out.print("Masukkan pilihan (angka): ");
        String strInput= input.nextLine();
        int intInput=5;
        try{
            intInput=Integer.parseInt(strInput);
            System.out.println(strInput);
            System.out.println("Menu diproses!");
        }catch(NumberFormatException e){
            System.out.println("Tidak memproses karena bukan angka");
        }

        System.out.print("Nama Pemesan: ");
        String nama=null;
        nama=input.nextLine();
        try{
            if(nama==null){
                throw new NullPointerException();
            }else{
                System.out.println(nama);
           }
        }catch(NullPointerException e){
            System.out.println("Nama tidak boleh kosong!");
        }
        
        try{
            System.out.print("Jumlah yang dipesan: ");
            int jml=input.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Masukkan angka");
        }
        
        String cek="Pesanan Selesai";
        for(int i=0; i<cek.length(); i++){
            System.out.print(cek.charAt(i));
        }
        
        System.out.println("");
        System.out.println("Panjang String: "+cek.length());
        
        try{
            System.out.println(cek.charAt(25));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Terjadi Exception");
        }
    }catch(RuntimeException e){
          System.out.println("Terjadi Kesalahan pada program");
    }
    }
}
