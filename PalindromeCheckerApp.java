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
       LinkedList<Character> list = new LinkedList<>();
        for (char c : text.toCharArray()) 
            list.add(c);
    
        boolean isPalindrome = true; 
        while (list.size() > 1) {
    
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is it a Palindrome? : "+isPalindrome);
        
        input.close(); 
    } 
}
