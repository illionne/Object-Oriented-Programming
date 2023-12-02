package Task;

public class WordsCounter {
    private String sentence;
    private String word;

    public WordsCounter(String sentence, String word) {
        this.sentence = sentence;
        this.word = word;
    }

    public int countOccurrences() {
        String[] words = sentence.split("\\s+");
        int count = 0;
        for (String w : words) {
            if (w.equalsIgnoreCase(this.word)) {
                count++;
            }
        }
        return count;
    }
}
