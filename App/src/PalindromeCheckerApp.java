import java.util.Scanner;
/**
 * ================================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 */
public class PalindromeCheckerApp {
    public static void main(String[] args){
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a string: ");
                String input = scanner.nextLine();

                // Convert string into character array
                char[] chars = input.toCharArray();

                // Initialize two pointers
                int start = 0;
                int end = chars.length - 1;

                // Assume palindrome initially
                boolean isPalindrome = true;

                // Compare characters using two-pointer technique
                while (start < end) {
                    if (chars[start] != chars[end]) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                // Display result
                if (isPalindrome) {
                    System.out.println("Is Palindrome : true");
                } else {
                    System.out.println("Is Palindrome : false");
                }

                scanner.close();
               }
    }
}
