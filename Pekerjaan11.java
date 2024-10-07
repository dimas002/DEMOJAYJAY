import java.util.Scanner;

public class Pekerjaan11 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka antara 1 hingga 100: ");
        int angka = scanner.nextInt();

        if (angka < 1 || angka > 100) {
            System.out.println("Angka di luar jangkauan");
        } else {

            if (angka % 2 == 0) {
                System.out.println("Angka " + angka + " adalah genap.");
            } else {
                System.out.println("Angka " + angka + " adalah ganjil.");
            }
        }
        // Menutup scanner
        scanner.close();
    }
}