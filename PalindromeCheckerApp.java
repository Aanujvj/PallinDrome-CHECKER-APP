import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {
        @Override
        public boolean check(String input) {
            if (input == null || input.isEmpty())
                return true;
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                stack.push(input.charAt(i));
            }
            StringBuilder reverseString = new StringBuilder();
            while (!stack.isEmpty())
                reverseString.append(stack.pop());
            return input.equals(reverseString.toString());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("text: ");
        String userInput = scanner.nextLine();

        PalindromeStrategy strategy = new StackStrategy();
        boolean isPalindrome = strategy.check(userInput);

        System.out.println("IS PALINDROME? : " + isPalindrome);
        scanner.close();
    }
}

