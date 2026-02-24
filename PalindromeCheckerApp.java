import java.util.Scanner; 
public class PalindromeCheckerApp 
{ 
    public static void main(String[] args) 
    { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter text : "); 
        String text= input.next();
        char[] chars= text.toCharArray(); 
        int start = 0,end=chars.length - 1;
        boolean isPalindrome = true;
        while(start<end)
        {
            if(chars[start]!=chars[end])
               {isPalindrome = false; break;}
            start++;end--;
        }
        if(isPalindrome)
            System.out.println("Is it a Palindrome? : true");
        else
            System.out.println("Is it a Palindrome? : false");
        input.close(); 
    } 
}
