package UTS_NO2_SI05B_3054;

public class commissionEmployee_3054 extends Employee_3054{
    int gajiPokok3054, komisi3054, totPenjualan3054;

    public commissionEmployee_3054(int gajiPokok3054, int komisi3054, int totPenjualan3054, String nama3054, int nip3054) {
        super(nama3054, nip3054);
        this.gajiPokok3054 = gajiPokok3054;
        this.komisi3054 = komisi3054;
        this.totPenjualan3054 = totPenjualan3054;
    }

    public float gaji(){
        return gajiPokok3054+(komisi3054*totPenjualan3054);
    }
    
    public void tambahan(){
        System.out.println("Gaji Pokok: "+gajiPokok3054);
        System.out.println("Komisi: "+komisi3054);
        System.out.println("Total Penjualan: "+totPenjualan3054);
        System.out.println("Total Gaji: "+(gajiPokok3054+(komisi3054*totPenjualan3054)));
    }
}
