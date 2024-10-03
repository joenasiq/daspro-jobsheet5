import java.util.Scanner;
public class KategoriUsia06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usia;
        System.out.print("Masukkan usia Anda: ");
        usia = scanner.nextInt();
            if (usia >= 0) {
                String kategori;
                if (usia >= 0 && usia <= 12) {
                    kategori = "Anak";
                    System.out.println("Anda termasuk dalam kategori: " + kategori);
                } else if (usia >= 13 && usia <= 19) {
                    kategori = "Remaja";
                    System.out.println("Anda termasuk dalam kategori: " + kategori);
                } else if (usia >= 20 && usia <= 64) {
                    kategori = "Dewasa";
                    System.out.println("Anda termasuk dalam kategori: " + kategori);
                } else if (usia > 64) {
                    kategori = "Lansia";
                    System.out.println("Anda termasuk dalam kategori: " + kategori);
                }
            } else if (usia<0) {
                System.out.println("Usia tidak boleh negatif. Silakan coba lagi.");
            } else {
            System.out.println("Input tidak valid. Harap masukkan angka.");
        }
        }
    }