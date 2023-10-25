package Pertemuan1;

public class SoccerPlayer extends contoh {
    // untuk mengambil item-item dari class contoh, bisa dengan melakukan
    // instence of class = objek (membuat objek dari class contoh ke class soccer)

    contoh c = new contoh();// instance of class

    // cara ambil item = c.x (x--> setter, getter, atribut, dll).

    public void ambilSetDariContoh() {

        super.setName("Nama");
        // super: untuk ambil fungsi yang ada di class induknya
    }

}
