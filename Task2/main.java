package Task2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka:");
        long num = scanner.nextLong();

        Number number = new Number(num);
        int count = number.countDigits();

        System.out.println("Jumlah digit: " + count);
    }
}