import java.util.Scanner;

public class Tabung extends BangunRuang{
    //menghapus constructor Tabung
    //menambah variabel tinggi, jari_jari dengan modifier private, bertipe data double dan juga membuat object Scanner
    Scanner scanner = new Scanner(System.in);
    private double tinggi;
    private double jari_jari;

    @Override
    public void inputNilai(){
        super.luasPermukaan();
        System.out.print("Input tinggi: ");
        tinggi = scanner.nextDouble();
        System.out.print("Input jari-jari: ");
        jari_jari = scanner.nextDouble();
    }

    @Override
    public void luasPermukaan(){
        /*memperbaiki rumus yang salah, dari 2 * Math.PI * jari_jari * (jari_jari); menjadi
        2 * Math.PI * jari_jari * (jari_jari + tinggi);
         */
        double hasil = 2 * Math.PI * jari_jari * (jari_jari + tinggi);
        super.luasPermukaan();

        /*memperbaiki output angka double dari  System.out.println("Hasil luas permukaan: " + hasil); menjadi
        System.out.println("Hasil luas permukaan: " + String.format("%.2f",hasil));
         */
        System.out.println("Hasil luas permukaan: " + String.format("%.2f",hasil));
    }

    @Override
    public void volume(){

        double hasil = Math.PI * Math.pow(jari_jari, 2) * tinggi;
        super.volume();
        /* merubah dari awalnya System.out.println("Hasil volume: " hasil); menjadi
        System.out.println("Hasil volume: " +String.format("%.2f",hasil));*/
        System.out.println("Hasil volume: " +String.format("%.2f",hasil));
    }
}
