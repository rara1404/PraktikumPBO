package UTS_NO3_SI05B_3054;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main3054 {
    public static void main(String[] args) {
        BufferedReader inputan= new BufferedReader(new InputStreamReader (System.in));
        Scanner input=new Scanner(System.in);
        ArrayList <asistenPraktikum3054> asisten= new ArrayList<asistenPraktikum3054>();
        System.out.print("Jumlah Asisten Praktikum: ");
        int jum= input.nextInt();
        asistenPraktikum3054 ap= new asistenPraktikum3054("PBO", 10, "18321191", "Rara", "Sistem Informasi", 4);
        System.out.println("=== Input Data Asisten Praktikum ===");
        System.out.print("NIM: ");
        ap.nim=input.nextLine();
        System.out.println("Nama: ");
        ap.nama=input.nextLine();
        System.out.println("Jurusan: ");
        ap.jurusan=input.nextLine();
        System.out.println("IPK");
        ap.ipk=input.nextInt();
        System.out.println("MK Asistensi: ");
        
        System.out.println("Jumlah Pertemuan: ");
        
        ArrayList <studentStaff3054> student= new ArrayList<studentStaff3054>();
        
        
        
        System.out.println(" ");
        System.out.println("Jumlah student staff: ");
        System.out.println("=== Input Data Student Staff ===");
        System.out.print("NIM: ");
        
        System.out.println("Nama: ");
        
        System.out.println("Jurusan: ");
        
        System.out.println("IPK");
        System.out.println("Unit Kerja: ");
        System.out.println("Jam Kerja: ");
       
        System.out.println("=== Data Asisten Praktikum ===");
        System.out.println("=== Data Student Staff ===");
    }
}
