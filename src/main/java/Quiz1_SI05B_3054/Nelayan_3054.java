package Quiz1_SI05B_3054;

public class Nelayan_3054 extends Penduduk_3054{
    //Attribute
    private int jmlBeratIkan_3054;
    private int jmlSolar_3054;

    Nelayan_3054() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double totalPendapatanNelayan_3054(int jmlBeratIkan_3054, int jmlSolar_3054){
        return (jmlBeratIkan_3054*50000) + (jmlSolar_3054* 10000);
    }
    
    public void tampilDataNelayan_3054(){
        System.out.println("Jumlah Berat Ikan: "+jmlBeratIkan_3054);
        System.out.println("Jumlah Solar: "+jmlSolar_3054);
    }

    public Nelayan_3054(int jmlBeratIkan_3054, int jmlSolar_3054) {
        this.jmlBeratIkan_3054 = jmlBeratIkan_3054;
        this.jmlSolar_3054 = jmlSolar_3054;
    }

    public int getJmlBeratIkan_3054() {
        return jmlBeratIkan_3054;
    }

    public void setJmlBeratIkan_3054(int jmlBeratIkan_3054) {
        this.jmlBeratIkan_3054 = jmlBeratIkan_3054;
    }

    public int getJmlSolar_3054() {
        return jmlSolar_3054;
    }

    public void setJmlSolar_3054(int jmlSolar_3054) {
        this.jmlSolar_3054 = jmlSolar_3054;
    }

    
    
}
