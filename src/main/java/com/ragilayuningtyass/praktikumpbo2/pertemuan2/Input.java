package com.ragilayuningtyass.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama= input.nextLine();
        
        System.out.print("Masukkan usia: ");
        int usia= input.nextInt();
        
        System.out.println("Nama saya: "+nama);
        System.out.println("Usia saya: "+usia+ " tahun");
    }
}
