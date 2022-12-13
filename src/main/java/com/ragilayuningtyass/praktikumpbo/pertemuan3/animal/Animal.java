package com.ragilayuningtyass.praktikumpbo.pertemuan3.animal;

public class Animal {
    //Attribute
    private String nama;
    private int umur;
    private String warna;
    
    //Constructor
    // {Alt] + (Fn)+ [insert] + Constructor -> Select All
    public Animal(String nama, int umur, String warna){
        //this dipake klo ada kesamaan nama
        this.nama= nama;
        this.umur=umur;
        this.warna=warna;
    }
        
    //Method mencetak semua attribute
    public void showProfile(){
        System.out.println("Name: "+nama);
        System.out.println("Umur: "+umur+ " tahun");
        System.out.println("Warna: "+warna);
    }
    
    // {Alt] + (Fn)+ [insert] + Getter & Setter -> Select All
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
    
}
