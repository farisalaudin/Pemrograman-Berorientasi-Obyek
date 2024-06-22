import java.util.Scanner;
//membuat class baru dengan nama Balok
public class Balok extends BangunRuang {
    private double panjang, lebar, tinggi;

    @Override
    public  void inputNilai() {
        super.inputNilai();
        Scanner inputuser = new Scanner(System.in);
        System.out.print("Input panjang: ");
        panjang = inputuser.nextDouble();
        System.out.print("Input lebar: ");
        lebar = inputuser.nextDouble();
        System.out.print("Input tinggi: ");
        tinggi = inputuser.nextDouble();
    }

    @Override
    public void luasPermukaan() {
        double hasil = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
        super.luasPermukaan();
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume() {
        double hasil = panjang * lebar * tinggi;
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}