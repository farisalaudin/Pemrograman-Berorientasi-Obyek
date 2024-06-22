import java.util.Scanner;

public class Kubus extends BangunRuang{
//menghapus constructor Kubus
    Scanner scanner = new Scanner(System.in);
    private double sisi;
    @Override
    public void inputNilai(){
        super.inputNilai();
        System.out.print("Input sisi: ");
        //merubah yang awalnya  sisi = scanner.nextnext(); menjadi  sisi = scanner.nextInt();
        sisi = scanner.nextInt();
    }

    @Override
    public void luasPermukaan(){
        double hasil = 6 * sisi * sisi;
        super.luasPermukaan();
        //merubah yang awalnya out.println("Hasil luas permukaan: " + hasil); menjadi System.out.println("Hasil luas permukaan: " + hasil);
        System.out.println("Hasil luas permukaan: " + hasil);
    }

    @Override
    public void volume(){
        double hasil = Math.pow(sisi, 3);
        super.volume();
        System.out.println("Hasil volume: " + hasil);
    }
}
