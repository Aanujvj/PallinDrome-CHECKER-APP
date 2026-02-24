import java.util.Scanner; 
public class PalindromeCheckerApp { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter text : "); 
        String text = input.next(); 
        String reversed="";
        for (int i = text.length() - 1; i >= 0; i--) 
            reversed = reversed + text.charAt(i); 
        

        if (text.equals(reversed)) 
            System.out.println("Is it Pallindrome? : true");
        else 
            System.out.println("Is it Pallindrome? : true");
        
        input.close(); 
    } 
}
