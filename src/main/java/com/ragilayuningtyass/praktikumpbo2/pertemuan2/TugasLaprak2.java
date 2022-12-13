package com.ragilayuningtyass.praktikumpbo2.pertemuan2;

import java.util.Scanner;

public class TugasLaprak2 {
    public static void main(String[] args) {
        System.out.println("Sign In RaraMart");
        Scanner input= new Scanner(System.in);
        
        System.out.print("Buat Username: ");
        String uname= input.nextLine();
        
        System.out.print("Buat Password: ");
        String pw= input.nextLine();
        
        int r=1;
        int login=0;  
        do{
            System.out.println("================");
            System.out.println(" Login RaraMart ");
            System.out.println("================");
            System.out.print("Username: ");
            String loginUname= input.nextLine();
            
            System.out.print("Password: ");
            String loginPw= input.nextLine();
            
            if(loginUname.equals(uname) && loginPw.equals(pw)){
                System.out.println("Anda Berhasil Login!");
                r=4;
                login=1;
            }else{
                System.out.println("Username atau Password yang Anda masukkan salah!");
                r=r+1;
            }      
        }while (r<=3);
        
        if (login !=1){
          System.out.println("Maaf Akun Anda Terblokir!!");
          System.out.println("Anda telah mencoba login sebanyak 3x");
    }
 
  }
}