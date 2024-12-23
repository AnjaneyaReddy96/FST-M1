
public class Activity2 {
	public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 77, 10, 54, -11, 10};

        // Call the method to check the condition
        boolean result = checkSumOfTens(numbers);

        // Print the result
        System.out.println("The sum of all 10's is exactly 30: " + result);
    }

    // Method to check if the sum of all 10's is exactly 30
    public static boolean checkSumOfTens(int[] array) {
        int sum = 0;

        // Iterate through the array
        for (int num : array) {
            // Add to sum if the number is 10
            if (num == 10) {
                sum += num;
            }
        }

        // Check if the sum equals 30
        return sum == 30;
    }
}

