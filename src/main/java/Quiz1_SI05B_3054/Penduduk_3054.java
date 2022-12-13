package Quiz1_SI05B_3054;

public class Penduduk_3054 {
    //Attribute
    protected String nik_3054;
    protected String nama_3054;
    protected String alamat_3054;
    protected int umur_3054;

    Penduduk_3054() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    //Method
    public void tampilDataPenduduk_3054(){
        System.out.print("NIK: "+nik_3054);
        System.out.print("Nama: "+nama_3054);
        System.out.print("Umur: "+umur_3054);
        System.out.print("Alamat: "+alamat_3054);
    }

    public Penduduk_3054(String nik_3054, String nama_3054, String alamat_3054, int umur_3054) {
        this.nik_3054 = nik_3054;
        this.nama_3054 = nama_3054;
        this.alamat_3054 = alamat_3054;
        this.umur_3054 = umur_3054;
    }

    public String getNik_3054() {
        return nik_3054;
    }

    public void setNik_3054(String nik_3054) {
        this.nik_3054 = nik_3054;
    }

    public String getNama_3054() {
        return nama_3054;
    }

    public void setNama_3054(String nama_3054) {
        this.nama_3054 = nama_3054;
    }

    public String getAlamat_3054() {
        return alamat_3054;
    }

    public void setAlamat_3054(String alamat_3054) {
        this.alamat_3054 = alamat_3054;
    }

    public int getUmur_3054() {
        return umur_3054;
    }

    public void setUmur_3054(int umur_3054) {
        this.umur_3054 = umur_3054;
    }

    
}
/*
        System.out.print("NIK: ");
        nik_3054=input.nextLine();
        System.out.print("Nama: ");
        nama_3054=input.nextLine();
        System.out.print("Umur: ");
        umur_3054=input.nextInt();
        System.out.print("Alamat: ");
        alamat_3054=input.nextLine();
*/