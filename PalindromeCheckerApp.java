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
        boolean result =true;

        for (int i = 0; i < text.length() / 2; i++) {

            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {

                result= false;
            }
        }
        result=true;
        System.out.println("Is Palindrome? : " + result);
        input.close(); 
    } 
    
}
