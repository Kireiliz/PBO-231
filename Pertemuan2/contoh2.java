package Pertemuan2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contoh2 {
    // membuat program untuk menghitung nilai akhir dari MK PBO per mahasiswa
    // NA = (uts*20%) + (uas*25%) + (tugas*55%)
    /*
     * NIM : 0111
     * NAMA : JODI
     * PRODI : S1
     * MK : PBO
     * NA : 88
     */

    // atribut
    private String nama;
    private String nim;
    private String prodi;
    private String mk;
    private double uts;
    private double uas;
    private double tugas;
    public double na;

    // operasi
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getProdi() {
        return this.prodi;
    }

    public String getMk() {
        return this.mk;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUts() {
        return this.uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getUas() {
        return this.uas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getTugas() {
        return this.tugas;
    }

    // custom method
    public double getNa(){
        na = (uts * 0.20) + (uas * 0.25) + (tugas * 0.55)
        return na;
    }

    // utk cetak NIM + NA
    public void cetakData(){
        System.out.println("NIM : "+ getNim() + "\n" + "NA : " + getNa());
    }

}

public class hitungnilaiakhir{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlahmhs = 0;

        try {
            jumlahmhs = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("input tidak valid. Harap Masukkan angka.");
            return;
        }

        contoh2[] mhsarray = new contoh2[jumlahmhs];

        for (int i = 0; i < jumlahmhs; i++){
            contoh2 mhs = new contoh2();

            System.out.print("Masukkan NIM mahasiswa ke-" + (i + 1) + ": ");
            mhs.setNim(reader.readLine());

            System.out.print("Masukkan Nama mahasiswa ke-" + (i + 1) + ": ");
            mhs.setNama(reader.readLine());

            System.out.print("Masukkan Prodi mahasiswa ke-" + (i + 1) + ": ");
            mhs.setProdi(reader.readLine());

            System.out.print("Masukkan MK mahasiswa ke-" + (i + 1) + ": ");
            mhs.setMk(reader.readLine());

            System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i + 1) + ": ");
            try {
                mhs.setUts(Double.parseDouble(reader.readLine()));
            } catch (NumberFormatException e) {
                System.out.println("Masukan nilai UTS tidak valid. Harap masukkan angka.");
                return;
            }

            System.out.print("Masukkan nilai UAS mahasiswa ke-" + (i + 1) + ": ");
            try {
                mhs.setUas(Double.parseDouble(reader.readLine()));

            } catch (NumberFormatException e) {
                System.out.println("Masukan nilai UTS tidak valid. Harap masukkan angka.");
                return;
            }

            System.out.print("Masukkan nilai Tugas mahasiswa ke-" + (i + 1) + ": ");
            try {
                mhs.setTugas(Double.parseDouble(reader.readLine()));
            } catch (NumberFormatException e) {
                System.out.println("Masukan nilai Tugas tidak valid. Harap masukkan angka.");
                return;
            }

            mhsarray[i]= mhs;
        }

        System.out.println("\nDaftar Nilai Akhir Mahasiswa:");
        System.out.println("====================================");
        System.out.println("NIM       Nama       Prodi       Mata Kuliah   Nilai Akhir");
        System.out.println("====================================");

        for (int i = 0; i < jumlahmhs; i++) {
            contoh2 mahasiswa = mahasiswaArray[i];
            System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" +
                    mahasiswa.getProdi() + "\t" + mahasiswa.getMataKuliah() + "\t" +
                    mahasiswa.getNilaiAkhir());
    }
}