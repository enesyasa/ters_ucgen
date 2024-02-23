import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan basamak sayısını al
        System.out.print("Basamak Sayısı: ");
        int basamakSayisi = scanner.nextInt();

        // Ters üçgeni çiz
        for (int i = basamakSayisi; i >= 1; i--) {
            for (int j = 1; j <= basamakSayisi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
