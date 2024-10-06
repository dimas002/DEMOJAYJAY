import java.util.Scanner;

public class Pekerjaan11 {

    public static void main(String[] args) {
        // Membuat scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka
        System.out.print("Masukkan angka antara 1 hingga 10: ");
        int angka = scanner.nextInt();

        // Memeriksa apakah angka berada dalam rentang 1 hingga 10
        if (angka < 1 || angka > 10) {
            System.out.println("Angka di luar jangkauan");
        } else {
            // Memeriksa apakah angka ganjil atau genap
            if (angka == 1 || angka == 3 || angka == 5 || angka == 7 || angka == 9) {
                System.out.println("Angka " + angka + " adalah ganjil.");
            } else if (angka == 2 || angka == 4 || angka == 6 || angka == 8 || angka == 10) {
                System.out.println("Angka " + angka + " adalah genap.");
            }
        }

        // Menutup scanner
        scanner.close();
    }
}

