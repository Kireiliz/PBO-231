package pertemuan6;

public class persegi {
    // luas Persegi: sisi x sisi

    private int sisi;

    public int getSisi() {
        return sisi;
    }

    // overloading method --> syarat : jumlah parameter berbeda
    public int getLuas() { // nilai sisi default
        return 4 * 4;
    }

    // inputan user dengan parameter
    public int getLuas(int s) {
        int Luas = s * s;
        return Luas;
    }

    // overriding -> ada sub class karena sifatnya pewarisan
    public void cetakLuas() {
        System.out.println("Luas persegi adalah " + getLuas());

    }
}
