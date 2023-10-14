import java.util.Random;

public class ShuffleArrayWithoutDSA {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);

        // Print the shuffled array
        System.out.print("Shuffled Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        int n = array.length;

        // Traverse the array from the last element to the first
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index between 0 and i (inclusive)
            int j = rand.nextInt(i + 1);

            // Swap the elements at indices i and j
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
