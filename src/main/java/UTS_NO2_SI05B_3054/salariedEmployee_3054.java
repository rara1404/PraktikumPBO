package UTS_NO2_SI05B_3054;

public class salariedEmployee_3054 extends Employee_3054{
    int upahMingguan3054;

        public salariedEmployee_3054(int upahMingguan3054, String nama3054, int nip3054) {
        super(nama3054, nip3054);
        this.upahMingguan3054 = upahMingguan3054;
    }
 
    public float gaji(){
        return upahMingguan3054;
    }
    
    public void tambahan(){
        System.out.println("Upah Mingguan: "+upahMingguan3054);
        System.out.println("Total Gaji: "+upahMingguan3054);
    }
}
