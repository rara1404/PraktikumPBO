package UTS_NO3_SI05B_3054;

public abstract class Mahasiswa3054 {
    protected String nim, nama, jurusan;
    protected int ipk;

    public Mahasiswa3054(String nim, String nama, String jurusan, int ipk) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }
    
    public abstract void tampilDataMhs();
}
