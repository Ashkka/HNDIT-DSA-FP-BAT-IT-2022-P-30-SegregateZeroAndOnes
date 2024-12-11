
            import java.util.Arrays;

    public class SegregateZeroAndOnes {
        public static void main(String[] args) {
            // Input array
            int[] array = {1, 0, 1, 0, 1, 0};

            // Function call to segregate 0s and 1s
            segregate(array);

            // Output the result
            System.out.println("Segregated Array: " + Arrays.toString(array));
        }

        public static void segregate(int[] array) {
            int count = 0; // Counter for 0s

            // Count the number of 0s
            for (int value : array) {
                if (value == 0) {
                    count++;
                }
            }

            // Fill the array with 0s and then with 1s
            for (int i = 0; i < array.length; i++) {
                if (i < count) {
                    array[i] = 0;
                } else {
                    array[i] = 1;
                }
            }
        }
    }

