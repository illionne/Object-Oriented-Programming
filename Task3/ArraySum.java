package Task3;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "]:");
            array[i] = scanner.nextInt();
        }

        System.out.println("Jumlah yang mana?");
        System.out.println("1. Semua");
        System.out.println("2. Ganjil");
        System.out.println("3. Genap");
        System.out.println("Pilih:");
        int choice = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if ((choice == 1) || (choice == 2 && array[i] % 2 != 0) || (choice == 3 && array[i] % 2 == 0)) {
                sum += array[i];
            }
        }

        System.out.println("Jumlah nilai array: " + sum);
    }
}