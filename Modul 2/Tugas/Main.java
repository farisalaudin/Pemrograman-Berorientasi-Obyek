import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }


//===============================================================================================================//
    static ArrayList<book> booklist = new ArrayList<>();
    static ArrayList<Mahasiswa> userstudent = new ArrayList<>();
    static Scanner inputpilihan = new Scanner(System.in);
    static Scanner inputuser = new Scanner(System.in);
    static String NIM;

    static class book{
        String idbuku, judulbuku, penulisbuku, genrebuku;
        int stokbuku;

        public book(String idbuku, String judulbuku, String penulisbuku, String genrebuku, int stokbuku){
            this.idbuku = idbuku;
            this.judulbuku = judulbuku;
            this.penulisbuku = penulisbuku;
            this.genrebuku = genrebuku;
            this.stokbuku = stokbuku;
        }
    }
    static class Mahasiswa{
        String nama, nim, fakultas, prodi;
        public Mahasiswa(String nama, String nim, String fakultas, String prodi){
            this.nama = nama;
            this.nim = nim;
            this.fakultas = fakultas;
            this.prodi = prodi;
        }
    }
    static void menu(){
        int menuloop = 0;
        do{
            System.out.println("\n==== Library System ====");
            System.out.print("\n1. Login as student\n2. Login as admin\n3. Exit\n");
            System.out.print("Choose option (1-3): ");

            int pilihan = inputpilihan.nextInt();
            switch (pilihan) {
                case 1:
                    student.loginstudent();
                    menustudent();
                    break;

                case 2:
                    Admin.loginadmin();
                    menuadmin();

                    break;

                case 3:
                    menuloop = 1;
                    break;
            }
        }while(menuloop == 0);
    }

    static void inputNIM(){
        System.out.println("Masukkan NIM: ");
        NIM = inputuser.nextLine();
    }

    static void menuadmin() {

        System.out.println("\n==== Admin Menu ====");
        System.out.println("\n1. Tambah Mahasiswa\n2. Daftar Mahasiswa\n3. Tambah Buku\n4. Logout");
        System.out.print("Choose option (1-3): ");

        int pilihan = inputpilihan.nextInt();
        switch (pilihan) {
            case 1:
                Admin.addstudent();
                menuadmin();
                break;
            case 2:
                Admin.displaystudent();
                menuadmin();
                break;
            case 3:
                Admin.addbook();
                menuadmin();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.print("Pilih 1-4");
                menuadmin();
        }


    }

    static void menustudent(){

        System.out.println("\n==== Student Menu ====");
        System.out.print("\n1. Daftar buku\n2. Pinjam buku\n3. Pengembalian buku\n4. Logout");
        System.out.println("\n Choose option (1-3): ");

        int pilihan = inputpilihan.nextInt();
        switch (pilihan){
            case 1:
                student.displaybooks();
                menustudent();
                break;
            case 2:
                System.out.println("\n====  Pinjam Buku  ====");
                System.out.println("\nMasukkan id buku: ");
                String idbukuyangdipinjam = inputuser.nextLine();
                for(Main.book i : Main.booklist){
                    if(i.idbuku.equals(idbukuyangdipinjam)){
                        if(i.stokbuku > 0){
                            i.stokbuku--;
                            System.out.println("Buku berhasil dipinjam");
                        }else{
                            System.out.println("Stok buku habis");
                        }
                    }
                }
                menustudent();
                break;
            case 3:
                System.out.println("\n====  Pengembalian Buku   ====");
                System.out.print("\nMasukkan id buku: ");
                String idbukupengembalian = inputuser.nextLine();
                for(Main.book i : Main.booklist){
                    if(i.idbuku.equals(idbukupengembalian)){
                        if(i.stokbuku >= 0){
                            i.stokbuku++;
                            System.out.println("Buku berhasil dikembalikan");
                        }
                    }
                }
                menustudent();
                break;
            case 4:
                student.logout();

            default:
                System.out.print("Pilih 1-4");
                menustudent();
        }

    }
}
