import java.util.Scanner;
public class Siakad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // input data 
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan nomor absen: ");
        int absen = input.nextInt();

        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = input.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = input.nextDouble();

        //hitung nilai akhir
        double nilaiAkhir = (nilaiKuis * 0.3)+ (nilaiTugas * 0.3)+ (nilaiUjian * 0.4);

        //menentukan nilai brdsrkn nilai akhir
        String nilaiHuruf;
        String kualifikasi;

        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir >50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            kualifikasi = "Gagal";
        }


        System.out.println("Mahasiswa dengan nama " + nama + " (NIM: " + nim + ") kelas " + kelas +
                            " nomor absen " + absen);
        System.out.println("Nilai akhir:  " + nilaiAkhir);
        System.out.println("Nilai akhir huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}