package pertemuan6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // instance of class polymorphism: menyesuaikan
        // instance of class inheritance: sub class
        persegi p = new persegi();
        p.cetakLuas();
    }
}
