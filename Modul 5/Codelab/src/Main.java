import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    //===================================== MAIN Method =========================================
    public static void main (String[]args){
        System.out.println("\n==== Codelab Modul 5 ====");
        inputName();
        displayName();

    }
    //===========================================================================================

    //========================================= ATRIBUT =========================================
    static ArrayList<String> arrNama = new ArrayList<>();//Arralist untuk menyimpan nama.
    static Scanner inputUser = new Scanner(System.in);// Scanner untuk menerima input dari pengguna.


    //========================================== METHOD ======================================

    //Method untuk input nama dan menambahkannya ke arraylist.
    public static void inputName() {

                for (int i = 1; i > 0; i++) {
                   System.out.print("-> Masukkan nama ke-" + i + ": ");
                   String nama = inputUser.nextLine();

                   try {
                    if(nama.equals("selesai")) {
                        break;

                    } else if (nama.isEmpty()) {
                        i--;
                        throw new IllegalArgumentException("\n>>> Nama tidak boleh kosong! <<<\n");

                    } else {
                        arrNama.add(nama);

                    }
                 } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());

                   }
                }
    }

        //method untuk menampilkan lis nama.
        public static void displayName () {

            System.out.println("\n-> Daftar mahasiswa yang diinputkan:");
            for (Object i : arrNama) {
                System.out.println("- "+i);
            }
        }
}
