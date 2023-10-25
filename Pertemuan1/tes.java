package Pertemuan1;

// tahapan 1/0: 
/*
 * 1. import i/o (Scanner --> data primitif (char,int, double)/BuferedReader --> jangkauan tipe data lebih luas)
 * 2. Error Handling
 * 3. Objek dari librabry I/O
 */

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class tes {
    public static void main(String[] args){
        //objek br
        BuferedReader br = new BuferedReader(new InputStreamReader(System.in));

        //instance of class
        contoh c = new contoh();

        //error handling
        try{
            //blok kode dengan asumsi benar
            //input
            System.out.println("---INPUT---");
            c.setName(br.readLine());
            //int c.setIPK(Integer.parseInt(br.readLine))
            //double --> c.setIPK(Double.parsedouble(br.readline))
            //output
            System.out.println(c.getName[]);
            c.getIpk(); // kalau di dalam sudah ada println

        }catch(Exception exc){
            //blok kode untuk menjalankan informasi kesalahan dari blok try
            System.out.println(exc.getMessage());
        }

    }
}
