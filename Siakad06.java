import java.util.Scanner;
public class Siakad06 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        String nama,nim, nilaiHuruf, kualifikasi;
        String prodi;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiUjian, nilaiAkhir;
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan prodi: ");
        prodi = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukka nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        nilaiAkhir = ((nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUTS * 0.3) + (nilaiUAS * 0.35));
        if (nilaiAkhir>=80) {
            nilaiHuruf = "A";
            kualifikasi = "sangat baik";
        }
        else if (nilaiAkhir>=73) {
            nilaiHuruf = "B+";
            kualifikasi = "lebih dari baik";
        }
        else if (nilaiAkhir>=65) {
            nilaiHuruf = "B";
            kualifikasi = "baik";
        }
        else if (nilaiAkhir>=60) {
            nilaiHuruf = "C+";
            kualifikasi = "lebih dari cukup";
        }
        else if (nilaiAkhir>=50) {
            nilaiHuruf = "C";
            kualifikasi = "cukup";
        }
        else if (nilaiAkhir>=39) {
            nilaiHuruf = "D";
            kualifikasi = "kurang";
        }
        else {
            nilaiHuruf = "E";
            kualifikasi = "gagal";
        }
        System.out.println(String.format("Mahasiswa dengan nama: %s\n(NIM %s)\n", nama, nim));
        System.out.println(String.format("Kelas: %s\n Absen: %d\n", kelas, absen));
        System.out.println(String.format("Nilai Akhir: " + nilaiAkhir +"\n"));
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
    }
}
