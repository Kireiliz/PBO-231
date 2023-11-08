package pertemuan6.polymorphism2;

import java.io.*;

import pertemuan6.subPersegi;

public class MainClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // instance of class
        Laundry master = new Laundry("", "", 0);
        transaksiLaundry transaksi = new transaksiLaundry("", "", 0, "", "", "", "", 0);

        // deklarasi variabel
        String jenis, nama, kode, metode, tglCuci, tglAmbil;
        int harga, berat;

        // menu
        // loop
        do {
            System.out.println("-- Laundryku --");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            System.out.print("Masukkan pilihan menu : ");
            int menu = Integer.parseInt(br.readLine());
            switch (menu) {
                case 1:
                    System.out.println("-- 1. Menu Master Data");
                    // input --> class laundry
                    System.out.print("Entri jenis cucian: ");
                    jenis = br.readLine();
                    System.out.print("Entri harga: ");
                    harga = Integer.parseInt(br.readLine());
                    System.out.print("Entri metode: ");
                    metode = br.readLine();
                    master = new Laundry(jenis, metode, harga);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("-- 2. Menu Transaksi");
                    System.out.print("Entri Kode: ");
                    kode = br.readLine();
                    System.out.print("Entri Nama: ");
                    nama = br.readLine();
                    System.out.print("Entri jenis cuci \n Cuci Setrika/Cuci Kering : ");
                    jenis = br.readLine();
                    System.out.print("Entri Harga");
                    harga = Integer.parseInt(br.readLine());
                    System.out.print("Entri metode (Regula/Express) : ");
                    metode = br.readLine();
                    System.out.print("Entri berat: ");
                    berat = Integer.parseInt(br.readLine());
                    System.out.print("Entri tgl cuci: ");
                    tglCuci = br.readLine();
                    System.out.print("Entri tgl Ambil : ");
                    tglAmbil = br.readLine();
                    // simpan ke constructor
                    transaksi = new transaksiLaundry(jenis, metode, harga, kode, nama, tglCuci, tglAmbil, berat);
                    System.out.println();
                    System.out.println("--- Cetak Data ---");
                    transaksi.transaksi();
                    break;
                case 3:
                    System.out.println("-- 3. Menu Cari Data");
                    System.out.print("Entri Kode transaksi yang dicari: ");
                    kode = br.readLine();

                    if (kode.equalsIgnoreCase(transaksi.getKode())) {
                        transaksi.transaksi(kode);
                    } else {
                        System.out.println("kode tidak ada");
                    }
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}
