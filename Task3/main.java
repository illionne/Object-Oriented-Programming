package Task3;
import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah array: ");
    
        int n = scanner.nextInt();

        Array array = new Array(n);
        for (int i = 0; i < n; i++) {
            System.out.print("a["+i+"]: ");
            int value = scanner.nextInt();
            array.setElement(i, value);
        }

        System.out.println("\nJumlah yang mana?");
        System.out.println("1. Semua");
        System.out.println("2. Ganjil");
        System.out.println("3. Genap");
        System.out.print("\nPilih: ");
        int choice = scanner.nextInt();

        int sum = array.sumElements(choice);
        System.out.println("Jumlah nilai array: " + sum);
    }
}