package UTS_NO3_SI05B_3054;

public class studentStaff3054 extends Mahasiswa3054 implements iPendapatan3054 {
    private int unitKerja, jamKerja;

    public studentStaff3054(int unitKerja, int jamKerja, String nim, String nama, String jurusan, int ipk) {
        super(nim, nama, jurusan, ipk);
        this.unitKerja = unitKerja;
        this.jamKerja = jamKerja;
    }

    @Override
    public void tampilDataMhs() {
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Jurusan: "+jurusan);
        System.out.println("IPK: "+ipk);
        System.out.println("Unit Kerja: "+unitKerja);
        System.out.println("Jam Kerja: "+jamKerja);
    }

    @Override
    public double totalPendapatan() {
        return jamKerja*30000;
    }
    
    
}
