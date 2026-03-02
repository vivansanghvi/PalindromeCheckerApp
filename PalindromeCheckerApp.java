/**
 * Use Case 10: Case-Insensitive & Space-Ignored Palindrome
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions moving inward using recursive calls.
 * The recursion stops when all characters are matched or a mismatch is found.
 * * @author Vivan
 * @version 10.0
 */
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "A man a plan a canal Panama";
        System.out.println("Input: " + input);
        String normalized = input.replaceAll("[^a-zA-Z0-0]", "").toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < normalized.length() / 2; i++)
        {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i))
            {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}