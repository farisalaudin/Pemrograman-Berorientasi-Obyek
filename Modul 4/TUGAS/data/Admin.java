package data;
import com.main.LibrarySystem;
import java.util.Random;
import java.util.Scanner;
import util.iMenu;

public class Admin extends User implements iMenu {
    static String adminusername = "admin";
    static String adminpassword = "admin";

    static String username, password;
    static Scanner inputuser = new Scanner(System.in);

    @Override
    public void menu() {
        Scanner inputpilihan = new Scanner(System.in);

        Admin adminObject = new Admin();
        System.out.println("\n==== Admin Menu ====");
        System.out.println("\n1. Tambah Mahasiswa\n2. Daftar Mahasiswa\n3. Tambah Buku\n4. Logout");
        System.out.print("Choose option (1-3): ");

        int pilihan = inputpilihan.nextInt();
        switch (pilihan) {
            case 1:
                Admin.addstudent();
                menu();
                break;
            case 2:
                Admin.displaystudent();
                menu();
                break;
            case 3:
                adminObject.inputBook();
                menu();
                break;
            case 4:
                LibrarySystem.menu();
                break;
            default:
                System.out.print("Pilih 1-4");
                menu();
        }


    }

    public static void addstudent() {
        int loop;
        System.out.println("\n==== Tambah Mahasiswa ====");
        System.out.print("masukkan Nama:");
        String nama = inputuser.nextLine();

        String nim;
        do {
            System.out.print("masukkan NIM:");
            nim = inputuser.nextLine();
            if (nim.length() != 15) {
                System.out.println("\n> NIM harus 15 digit");
                loop = 0;
            } else {
                loop = 1;
            }
        } while (loop == 0);
        System.out.print("masukkan Fakultas:");
        String fakultas = inputuser.nextLine();

        System.out.print("masukkan jurusan:");
        String jurusan = inputuser.nextLine();

        Student.arr_userStudent.add(new Student.UserStudent(nama, nim, fakultas, jurusan));

        System.out.println("==== berhasil didaftarkan ====");
    }
    @Override
    public void inputBook() {
        super.inputBook();
    }
    @Override
    public void choiceBooks() {
        super.choiceBooks();
    }
    public static void displaystudent() {
        System.out.println("\n==== Daftar Mahasiswa ====");
        for (Student.UserStudent i : Student.arr_userStudent) {
            System.out.print("Nama : "+ i.nama +"\n" );
            System.out.print("NIM : " + i.nim + "\n");
            System.out.print("Fakultas : " + i.fakultas + "\n");
            System.out.print("Prodi : " + i.prodi + "\n");
            System.out.println("============================");

        }

    }
    boolean isAdmin() {
        System.out.println("\n==== Login ====");
        System.out.print("Masukkan Username: \n");
        username = inputuser.nextLine();

        System.out.print("Massukkan password: \n");
        password = inputuser.nextLine();

        if (username.equals(adminusername) && password.equals(adminpassword)) {
            System.out.println("==== Login berhasil ====\n");
            return true;
        } else {
            System.out.println("==== Pengguna tidak ditemukan ====");
            LibrarySystem.menu();
            return false;
        }
    }
    public void validasiLogin(){
        if(isAdmin()){
            menu();
        }else{
            isAdmin();
        }
    }

     public String generateId () {
            Random random = new Random();

            StringBuilder idTengah = new StringBuilder();
            StringBuilder idAkhir = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                idTengah.append(random.nextInt(10));
                idAkhir.append(random.nextInt(10));

            }
            return ("UMM-" + idTengah + "-" + idAkhir);

        }



}

