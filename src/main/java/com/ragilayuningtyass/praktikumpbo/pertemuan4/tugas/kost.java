package com.ragilayuningtyass.praktikumpbo.pertemuan4.tugas;

public class kost extends RaraKostel{
    String kmrMandi;
    
    public void pembayaran (int bulan){
        System.out.println("Kamar pesanan "+namaPemesan+ " telah dibayar selama " +bulan+ " bulan");
    }
    
    public void pembayaran(){
        System.out.println("Error: Tidak ada info!");
    }
    
    public void tambahan(){
        System.out.println("Tipe kamar mandi: "+kmrMandi);
    }
}
