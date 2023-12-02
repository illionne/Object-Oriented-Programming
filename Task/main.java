package Task;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kalimat:");
        String sentence = scanner.nextLine();
        System.out.println("Masukkan kata yang ingin dicari:");
        String word = scanner.nextLine();

        WordsCounter wordsCounter = new WordsCounter(sentence, word);
        int count = wordsCounter.countOccurrences();

        System.out.println("Jumlah dari kata " + word + " dalam kalimat adalah " + count);
    }
}