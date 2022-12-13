package Quiz1_SI05B_3054;

import java.util.Scanner;

public class Main_3054 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        Penduduk_3054 pn= new Penduduk_3054();
        
        System.out.print("NIK: ");
        pn.nik_3054=input.nextLine();
        System.out.print("Nama: ");
        pn.nama_3054=input.nextLine();
        System.out.print("Umur: ");
        pn.umur_3054=input.nextInt();
        System.out.print("Alamat: ");
        pn.alamat_3054=input.nextLine();
        System.out.println("Dokter/ Nelayan: ");
        String masukkan= input.nextLine();
        
        if ("Dokter".equals(masukkan)){
            Dokter_3054 dk= new Dokter_3054();
            System.out.println("Jumlah Obat: ");
            dk.setJmlObat_3054(3);
            System.out.println("Jumlah Pasien: ");
            dk.setJmlPasien_3054(2);
            
            dk.tampilDataPenduduk_3054();
            dk.tampilDataDokter();
            dk.totalPendapatanDokter_3054(3, 2);
        }
        else{
            Nelayan_3054 nl= new Nelayan_3054();
            System.out.println("Jumlah Berat Ikan: ");
            nl.setJmlBeratIkan_3054(3);
            System.out.println("Jumlah Solar: ");
            nl.setJmlSolar_3054(1);
            
            nl.tampilDataPenduduk_3054();
            nl.tampilDataNelayan_3054();
            nl.totalPendapatanNelayan_3054(3, 1);
        }
        
    }
}
