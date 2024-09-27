import java.util.Scanner;

public class main {
    public static void main(String[] args) {

      //int a = 500;
      //int b = 109;
      //int sum = a + b;             // Penjumlahan
      //int difference = a - b;      // Pengurangan
      //int product = a * b;         // Perkalian
      //int quotient = a / b;        // Pembagian
      //int remainder = a % b;       // Sisa bagi

 // Menampilkan hasil
 //System.out.println("Hasil penjumlahan (a + b): " + sum);
 //System.out.println("Hasil pengurangan (a - b): " + difference);
 //System.out.println("Hasil perkalian (a * b): " + product);
 //System.out.println("Hasil pembagian (a / b): " + quotient);
 //System.out.println("Sisa bagi (a % b): " + remainder);

  Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan dua bilangan bulat
        System.out.print("Masukkan bilangan pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int angka2 = scanner.nextInt();
    
        System.out.println("\nHasil Perbandingan:");
        System.out.println(angka1 + " == " + angka2 + " : " + (angka1 == angka2));
        System.out.println(angka1 + " != " + angka2 + " : " + (angka1 != angka2));
        System.out.println(angka1 + " > " + angka2 + " : " + (angka1 > angka2));
        System.out.println(angka1 + " >= " + angka2 + " : " + (angka1 >= angka2));
        System.out.println(angka1 + " < " + angka2 + " : " + (angka1 < angka2));
        System.out.println(angka1 + " <= " + angka2 + " : " + (angka1 <= angka2));

        // Menutup scanner
        scanner.close();
  
    }
  }
