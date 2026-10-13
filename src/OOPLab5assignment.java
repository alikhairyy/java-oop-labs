import java.util.Scanner;

 
public class OOPLab5assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter a string: ");
         String input = sc.nextLine();      
         
         int vowels = 0, consonants = 0, digits = 0;
         String lowerInput = input.toLowerCase();
         
         for(int i =0; i < lowerInput.length(); i++){
             char ch = lowerInput.charAt(i);
             
             
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            }
        }

        // Reverse the string using StringBuffer
        StringBuffer reversed = new StringBuffer(input);
        reversed.reverse();

        System.out.println("\nNumber of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
