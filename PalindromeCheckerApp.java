import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack; 
public class PalindromeCheckerApp 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter text : "); 
        String text= input.next();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) 
            deque.addLast(c);
    
        boolean isPalindrome = true; 
        while (deque.size() > 1) {

            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : "+isPalindrome);
        
        input.close(); 
    } 
}
