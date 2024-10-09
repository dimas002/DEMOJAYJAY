public class ForEachloop {

public static void main(String[] args) {
    String[] warna = { "hitam", "biru","putih","merah","kuning" };

   for (String w : warna  ) {
    if (w.equals("putih")){
        continue;
    }
        System.out.println("Warnanya adalah " + w);
 }

    System.out.println(); // Menambahkan baris kosong untuk pemisah output

    // // Mencetak elemen kecuali "putih"
    for (String w : warna) {
        if (w.equals("putih")) {
            continue; // Lewati warna "putih"
        }
       System.out.println(w);
    }
}
}
