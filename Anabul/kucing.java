public class kucing {
    public String nama;
    public String warna;
    public int umur;
    public boolean lapar;

    public kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
        this.lapar = true;
    }

    public void meow() {
        System.out.println(nama + " says: stardenburdenhardenbart!");
    }

    public void makan(String makanan) {
        System.out.println(nama + " mangan " + makanan);
        lapar = false;
    }

    public void tidur() {
        System.out.println(nama + " turu sek");
        lapar = true; // The cat might wake up hungry
    }

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Lapar: " + (lapar ? "meong" : "meow"));
    }

    public static void main(String[] args) {
        // Create a Kucing object
        kucing myCat = new kucing("Muhammad sumbul", "pelangi", 3);

        // Call methods to interact with the cat
        myCat.info(); // Display initial info
        myCat.meow();
        myCat.makan("wiskas");
        myCat.tidur();
        myCat.info();
    }
}
