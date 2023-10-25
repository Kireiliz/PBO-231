package Pertemuan1;

public class contoh {// identitas

    // atribut = variabel
    // private/protected

    private String name;

    public double ipk;

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getIpk() {
        return this.ipk;
    }

    // operasi/fungsi
    // setter/constructor = prosedur

    public void setName(String n) {
        // jika nama atribut pada class sama dengan nama atribut pada parameter
        // setter/getter,
        // maka, beri keyword this
        // this.name = name;
        name = n;
    }

    // getter = fungsi --> tanpa parameter, harus ada return
    public String getName() {
        return this.name;
    }

    // custom method --> fungsi2 lain

}