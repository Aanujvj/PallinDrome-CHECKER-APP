import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack; 
public class PalindromeCheckerApp 
{ 
    private static boolean check(String s, int start, int end) {
        if (start >= end) 
            return true;
        if (s.charAt(start) != s.charAt(end)) 
            return false;
        return check(s, start + 1, end - 1);
    }
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter text : "); 
        String text= input.next();
        boolean result = check(text, 0, text.length() - 1);
        System.out.println("Is Palindrome? : " + result);
        input.close(); 
    } 
    
}
