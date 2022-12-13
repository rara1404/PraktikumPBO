package UTS_NO2_SI05B_3054;

import java.util.Scanner;

public class main_3054 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        char ulang;
        do{
            System.out.println("Menu Employee");
            System.out.println("1. Salaried");
            System.out.println("2. Commission");
            System.out.println("3. Project");
            System.out.print("Masukkan pilihan employee: ");
            int pil= input.nextInt();

        switch (pil){
            case 1:
                salariedEmployee_3054 se= new salariedEmployee_3054(200000,"Dewi", 18321191);
                               
                //Method
                se.tampilkan();
                se.gaji();
            break;
            case 2:
                commissionEmployee_3054 ce=new commissionEmployee_3054 (3000000,25000,2,"Eka",18321192);
                              
                //Method
                ce.gaji();
                ce.tampilkan();
            break;
            
            case 3:
                projectPlanner_3054 pp= new projectPlanner_3054 (500000,50000,5,"Ani",1832181);
                
                pp.gaji();
                pp.tampilkan();
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

