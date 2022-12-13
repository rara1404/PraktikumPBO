package com.ragilayuningtyass.praktikumpbo.pertemuan5.tugas;

import java.util.Scanner;

public class AntrianDokter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.println("-- DAFTAR ANTRIAN DOKTER --");
        System.out.print("Masukkan jumlah antrian: ");
        int a= input.nextInt();
        
        String[] nama = new String[a];
        int[] umur= new int[a];
        int[] kdDiagnosis= new int[a];
        String[] diagnosis= new String[a];
        
        for(int r=0; r<a; r++){
            System.out.println("Antrian ke: "+(r+1));
            System.out.print("Nama: ");
            nama[r]=input.next();
            
            System.out.print("Umur: ");
            umur[r]=input.nextInt();
            
            System.out.print("Kode Diagnosis: ");
            kdDiagnosis[r]=input.nextInt();
            
            if (kdDiagnosis[r]== 0){
                diagnosis[r]= "Harus Dirujuk Ke RS";
            }else {
                diagnosis[r]= "Rawat Jalan";
            }  
         }
        
         System.out.println("DAFTAR ANTRIAN PASIEN");
         System.out.println("+++++++++++++++++++++");
         System.out.println("No.     Nama       Umur    Kode Diagnosis  Diagnosis ");
            
         for(int i=0; i<a; i++){
            System.out.println((i+1)+"      "+nama[i]+"         "+umur[i]+"       "+kdDiagnosis[i]+"              "+diagnosis[i]);
        }
    }
}