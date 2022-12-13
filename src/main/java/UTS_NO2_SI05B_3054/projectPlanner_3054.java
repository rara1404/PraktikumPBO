package UTS_NO2_SI05B_3054;

public class projectPlanner_3054 extends Employee_3054{
     int gajiPokok3054, komisi3054, totHasil3054;

    public projectPlanner_3054(int gajiPokok3054, int komisi3054, int totHasil3054, String nama3054, int nip3054) {
        super(nama3054, nip3054);
        this.gajiPokok3054 = gajiPokok3054;
        this.komisi3054 = komisi3054;
        this.totHasil3054 = totHasil3054;
    }
    
    public int gaji(){
        return gajiPokok3054+(komisi3054*totHasil3054)-(gajiPokok3054*5/100);
    }
    
    public void tambahan(){
        System.out.println("Gaji Pokok: "+gajiPokok3054);
        System.out.println("Komisi: "+komisi3054);
        System.out.println("Total Hasil Proyek: "+totHasil3054);
        System.out.println("Total Gaji: "+(gajiPokok3054+(komisi3054*totHasil3054)-(gajiPokok3054*5/100)));
    }
}
