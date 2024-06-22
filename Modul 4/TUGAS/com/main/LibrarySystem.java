
package com.main;

import data.Admin;
import data.Student;
import java.util.Scanner;

public class LibrarySystem {
    static Scanner inputpilihan;
    static Scanner inputuser;
    public static String NIM;

    public LibrarySystem() {
    }

    public static void main(String[] args) {
        menu();

    }

    public static void inputNIM() {
        System.out.println("Masukkan NIM: ");
        NIM = inputuser.nextLine();
    }

    public static void menu() {
        int menuloop = 0;
        Admin adminObj = new Admin();
        Student studentObj = new Student();

        while(menuloop == 0) {
            System.out.println("\n==== Library System ====");
            System.out.print("\n1. Login as student\n2. Login as admin\n3. Exit\n");
            System.out.print("Choose option (1-3): ");
            int pilihan = inputpilihan.nextInt();
            switch (pilihan) {
                case 1:
                    Student.loginstudent();
                    studentObj.menu();
                    break;
                case 2:
                    adminObj.validasiLogin();
                    adminObj.menu();
                    break;
                case 3:
                    menuloop = 1;
                    break;

                default:
                    System.out.println("Pilih 1-3\n");
            }
        }


    }

}
