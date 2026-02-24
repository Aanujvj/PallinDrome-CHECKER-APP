import java.util.Scanner; 
public class PalindromeCheckerApp { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter text : "); 
      
        String text = input.next(); 
        boolean isPalindrome = true;
        for(int i = 0; i < text.length() / 2; i++) { 
            
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)) { 
                isPalindrome = false; 
                break; 
            }
        } 
        
        if(isPalindrome) 
            System.out.println("Is it a Palindrome? : true"); 
        else 
            System.out.println("Is it a Palindrome? : false"); 
        
        input.close(); 
    } 
}
