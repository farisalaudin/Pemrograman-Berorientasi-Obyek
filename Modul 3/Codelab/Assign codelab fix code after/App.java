// Menghapus parameter name dari constructor class Tabung, Kubus, dan Balok
public class App {
    public static void main(String[] args){
        //menghapus teks yang ada didalam kurung
        Tabung tabung = new Tabung();
        Kubus kubus = new Kubus();
        Balok balok = new Balok();

        // Memanggil method setName() untuk menetapkan nama pada setiap bangun ruang
        tabung.setName("Tabung");
        kubus.setName("Kubus");
        balok.setName("Balok");

        balok.inputNilai();
        balok.luasPermukaan();
        balok.volume();

        kubus.inputNilai();
        kubus.luasPermukaan();
        kubus.volume();

        tabung.inputNilai();
        tabung.luasPermukaan();
        tabung.volume();
    }
}