package UTS_NO3_SI05B_3054;

public class asistenPraktikum3054 extends Mahasiswa3054 implements iPendapatan3054{
    private String mkAsistensi;
    private int jmlPertemuan;

    public asistenPraktikum3054(String mkAsistensi, int jmlPertemuan, String nim, String nama, String jurusan, int ipk) {
        super(nim, nama, jurusan, ipk);
        this.mkAsistensi = mkAsistensi;
        this.jmlPertemuan = jmlPertemuan;
    }

    @Override
    public void tampilDataMhs() {
        System.out.println("NIM: "+nim);
        System.out.println("Nama: "+nama);
        System.out.println("Jurusan: "+jurusan);
        System.out.println("IPK: "+ipk);
        System.out.println("Mata Kuliah Asistensi: "+mkAsistensi);
        System.out.println("Jumlah Pertemuan: "+jmlPertemuan);
    }

    @Override
    public double totalPendapatan() {
        return jmlPertemuan*50000;
    }        
}
