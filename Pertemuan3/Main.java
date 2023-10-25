package Pertemuan3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
         * 1. Pendaftaran member
         * 2. Transaksi Pembelian barang
         * - punya member/tidak jika member (telp), cek notelp sama/tidak dengan yang
         * sudah di daftar. dapat poin
         * - jika tidak member, hanya proses transaksi biasa
         */
        Pembeli member = new Pembeli(null, null, 0, null);
        Pembeli transaksi = new Pembeli(null, 0, 0);

        // -const = perlu deklarasi ulang variabel

        String namaBrg, namaPembeli, alamat, telp;
        int usia, jml, hrg;

        try {
            do {
                System.out.println("--- Maret April ---");
                System.out.println("1. Pendaftaran");
                System.out.println("2. Transaksi");
                System.out.println("3. Keluar Aplikasi");
                System.out.print("Pilih Menu:");
                int menu = Integer.parseInt(br.readLine());
                switch (menu) {
                    case 1:
                        // 1. dftr member
                        System.out.println("--- Daftar Member ---");
                        System.out.print("Nama:");
                        namaPembeli = br.readLine();
                        System.out.print("Alamat:");
                        alamat = br.readLine();
                        System.out.print("No.Telp:");
                        telp = br.readLine();
                        System.out.print("Usia:");
                        usia = Integer.parseInt(br.readLine());

                        member = new Pembeli(namaPembeli, alamat, usia, telp);
                        break;

                    case 2:
                        // 2. transaksi
                        System.out.println("--- Transaksi ---");
                        System.out.print("Nama Barang: ");
                        namaBrg = br.readLine();
                        System.out.print("Harga Barang: ");
                        hrg = Integer.parseInt(br.readLine());
                        System.out.print("Jumlah beli: ");
                        jml = Integer.parseInt(br.readLine());

                        // data di simpan dalam constructor
                        transaksi = new Pembeli(namaBrg, jml, hrg);
                        System.out.println("Total Belanja: " + transaksi.getTotal());

                        System.out.print("Member? (Y/N)");
                        String jawab = br.readLine();
                        if (jawab.equalsIgnoreCase("Y")) {
                            System.out.print("Masukkan No.Telp:");
                            telp = br.readLine();
                            // cek no telp sama dengan yang didaftarkan atau tidak
                            if (telp.equalsIgnoreCase(member.getNoTelp())) {
                                System.out.println("No telp yang didaftarkan : " + member.getNoTelp());
                                System.out.println("Poin anda adalah: " + transaksi.getMemberPoin());

                            } else {
                                System.out.println("Mohon maaf no telp tidak terdaftar");
                            }
                            // melakukan transaksi..
                            // input barang

                        } else {

                        }
                        break;
                    default:
                        // keluar program
                        System.exit(menu);
                }

            } while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
