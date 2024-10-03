import java.util.Scanner;
public class PemilihanHariDenganIf06 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber;
        String dayType;

        System.out.print("Masukkan nomor hari (1-7): ");
        dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5) {
            dayType = "Weekday";
        } else if (dayNumber == 6 || dayNumber == 7) {
            dayType = "Weekend";
        } else {
            dayType = "Invalid Number";
        }

        System.out.println("Hari ke-" + dayNumber + " adalah " + dayType);
    }
}
