import java.util.Scanner;
import java.util.Stack; 
public class PalindromeCheckerApp 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter text : "); 
        String text= input.next();
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) 
            stack.push(c);
        boolean isPalindrome = true;
        
        for (char c : text.toCharArray()) 
            if (c != stack.pop())
            {
                isPalindrome = false;
                break;
            }
        
        if(isPalindrome)
            System.out.println("Is it a Palindrome? : true");
        else
            System.out.println("Is it a Palindrome? : false");
        
        input.close(); 
    } 
}
