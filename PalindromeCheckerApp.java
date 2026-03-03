import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack; 
public class PalindromeCheckerApp 
{
    public static boolean checkPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter text : "); 
        String text= input.next();
        System.out.println("Is Palindrome? : " + checkPalindrome(text));
        input.close(); 
    } 
    
}
