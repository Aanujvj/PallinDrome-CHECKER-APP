import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("TEXT: ");
        String testString = scanner.nextLine();
        System.out.println("\n--- Palindrome Performance Comparison ---");

        // 1. Measure Two-Pointer Algorithm
        long startTime1 = System.nanoTime();
        boolean res1 = isPalindromeTwoPointer(testString);
        long endTime1 = System.nanoTime();
        long duration1 = endTime1 - startTime1;

        // 2. Measure String Reversal Algorithm
        long startTime2 = System.nanoTime();
        boolean res2 = isPalindromeReversal(testString);
        long endTime2 = System.nanoTime();
        long duration2 = endTime2 - startTime2;

        // 3. Display Results
        displayResults("Two-Pointer", duration1, res1);
        displayResults("String Reversal", duration2, res2);

        scanner.close();
    }

    // Algorithm 1: Two-Pointer (O(1) extra space)
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeReversal(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    private static void displayResults(String name, long time, boolean result) {
        System.out.println("Algorithm: " + name);
        System.out.println("Result: " + (result ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time: " + time + " nanoseconds");
        System.out.println("---------------------------------------");
    }
}
