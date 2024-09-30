import java.util.Scanner; //import library Scanner

public class PemilihanBilangan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        // steruktur pemilihan menggunakan tenary operator 
        String hasil = (angka % 2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
        System.out.println("Angka " + angka + " " + hasil);
        }
    }
