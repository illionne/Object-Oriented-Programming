package Task3;
public class Array {
    private int[] array;

    public Array(int n) {
        array = new int[n];
    }

    public void setElement(int index, int value) {
        array[index] = value;
    }

    public int sumElements(int choice) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (choice == 1 ||
                (choice == 2 && array[i] % 2 == 0) ||
                (choice == 3 && array[i] % 2 != 0)) {
                sum += array[i];
            }
        }
        return sum;
    }
}