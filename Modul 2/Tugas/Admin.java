
import java.util.Scanner;

public class Admin {
    public static String adminusername = "admin";
    public static String adminpassword = "admin";
    static Scanner inputuser = new Scanner(System.in);

        boolean isAdmin(String username, String password){
        return username.equals(adminusername) && password.equals(adminpassword);
        }
    static void loginadmin(){
         Admin isAdminobject = new Admin();
        int adminloop;
        do {
            System.out.println("\n==== Login ====");
            System.out.print("Masukkan Username: \n");
            String username = inputuser.nextLine();

            System.out.print("Massukkan password: \n");
            String password = inputuser.nextLine();

            if (isAdminobject.isAdmin(username, password)) {
                System.out.println("==== Login berhasil ====\n");
                adminloop = 1;
            } else {
                System.out.println("==== Pengguna tidak ditemukan ====");
                adminloop = 0;
            }
        }while (adminloop == 0);
    }
    static void displaystudent(){
        System.out.println("\n==== Daftar Mahasiswa ====");
        for(Main.Mahasiswa i : Main.userstudent){
            System.out.print("Nama : " +i.nama+ "\n");
            System.out.print("NIM : " +i.nim+ "\n");
            System.out.print("Fakultas : " +i.fakultas+ "\n");
            System.out.print("Prodi : " +i.prodi+ "\n");
            System.out.println("============================");

        }

    }

    static void addstudent(){
        int loop;
        System.out.println("\n==== Tambah Mahasiswa ====");
        System.out.print("masukkan Nama:");
        String nama = inputuser.nextLine();

        String nim;
        do {
            System.out.print("masukkan NIM:");
            nim = inputuser.nextLine();
            if(nim.length() != 15){
                System.out.print("\nNIM harus 15 digit");
                loop = 0;
            }else{
                loop = 1;
            }
        }while(loop == 0);
        System.out.print("masukkan Fakultas:");
        String fakultas = inputuser.nextLine();

        System.out.print("masukkan jurusan:");
        String jurusan = inputuser.nextLine();

        Main.userstudent.add(new Main.Mahasiswa(nama, nim,fakultas, jurusan));
        System.out.println("==== berhasil didaftarkan ====");
    }
    static void addbook(){
        Scanner inputuser = new Scanner(System.in);


        System.out.println("\n==== Tambah Buku ====");
        System.out.print("Masukkan id buku: ");
        String idbuku = inputuser.nextLine();

        System.out.print("Masukkan judul Buku: ");
        String judulbuku = inputuser.nextLine();

        System.out.print("Masukkan Nama Penulis: ");
        String penulisbuku = inputuser.nextLine();

        System.out.print("Masukkan Kategori Buku: ");
        String kategoribuku = inputuser.nextLine();

        System.out.print("Masukkan Jumlah Stok Buku: ");
        int stokbuku = inputuser.nextInt();


        Main.booklist.add(new Main.book(idbuku, judulbuku, penulisbuku, kategoribuku, stokbuku));




        System.out.println("==== Buku berhasil ditambahkan ====");
    }


}
