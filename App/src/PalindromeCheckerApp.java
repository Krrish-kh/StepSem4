import java.util.Scanner;

/**
 ================================================================
 MAIN CLASS - UseCase2PalindromeCheckerApp
 ================================================================

 Use Case 2: Hardcoded Palindrome Validation

 Description:
 This class demonstrates basic palindrome validation
 using a hardcoded string value.

 At this stage, the application:
 - Stores a predefined string
 - Compares characters from both ends
 - Determines whether the string is a palindrome
 - Displays the result on the console

 This use case introduces fundamental comparison logic
 before using advanced data structures.
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
        boolean ispalindrome = true;
        String text = "madam";
        for (int i =0;i<text.length()/2;i++){
            if(text.charAt(i) != text.charAt(text.length()-1-i)){
                ispalindrome = false;
                break;
            }
        }
        System.out.println("Input Text:"+text);
        System.out.println("Is it a Palindrome? " + ispalindrome);
    }
}
