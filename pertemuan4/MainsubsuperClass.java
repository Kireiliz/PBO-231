
import java.io.*;

public class MainsubsuperClass {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // instansi of class
        subClass s = new subClass("", "", 0);

        System.out.println("---INPUT---");
        System.out.print("Masukkan nama: ");
        String nama = br.readLine();
        System.out.print("Masukkan Keterangan: ");
        String ket = br.readLine();
        System.out.print("Masukkan usia: ");
        int usia = Integer.parseInt(br.readLine());

        // masukkan data ke objek constructor
        s = new subClass(nama, ket, usia);

        System.out.println("---Data Yang di Di Input---");
        System.out.println("Nama: " + s.getNama());
        System.out.println("Keterangan: " + s.getKeterangan());
        System.out.println("Usia: " + s.getUsia());
    }
}
