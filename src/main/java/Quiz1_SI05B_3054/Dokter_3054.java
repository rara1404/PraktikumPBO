package Quiz1_SI05B_3054;

public class Dokter_3054 extends Penduduk_3054 {
    private int jmlPasien_3054;
    private int jmlObat_3054;

    Dokter_3054() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double totalPendapatanDokter_3054(int getJmlPasien_3054, int getJmlObat_3054){
        return  (jmlPasien_3054*50000) + (jmlObat_3054* 10000);

    }
    public void tampilDataDokter(){
        System.out.println("Jumlah Pasien: "+jmlPasien_3054);
        System.out.println("Jumlah Obat: " +jmlObat_3054);
    }

    public Dokter_3054(int jmlPasien_3054, int jmlObat_3054) {
        this.jmlPasien_3054 = jmlPasien_3054;
        this.jmlObat_3054 = jmlObat_3054;
    }

    public int getJmlPasien_3054() {
        return jmlPasien_3054;
    }

    public void setJmlPasien_3054(int jmlPasien_3054) {
        this.jmlPasien_3054 = jmlPasien_3054;
    }

    public int getJmlObat_3054() {
        return jmlObat_3054;
    }

    public void setJmlObat_3054(int jmlObat_3054) {
        this.jmlObat_3054 = jmlObat_3054;
    }
    
    
}
