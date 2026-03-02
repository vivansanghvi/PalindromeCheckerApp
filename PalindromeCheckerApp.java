/**
 * UC11: Object-Oriented Palindrome Service
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions moving inward using recursive calls.
 * The recursion stops when all characters are matched or a mismatch is found.
 * * @author Vivan
 * @version 11.0
 */
public class PalindromeCheckerApp
{
    public static void main(String[] args)
    {
        String input = "racecar";
        System.out.println("Input: " + input);
        PalindromeService service = new PalindromeService();
        boolean isPalindrome = service.checkPalindrome(input);

        System.out.println("Is Palindrome?: " + isPalindrome);
    }
}


class PalindromeService
{
    public boolean checkPalindrome(String input)
    {
        int start = 0;
        int end = input.length() - 1;
        while (start < end)
        {
            if (input.charAt(start) != input.charAt(end))
            {
                return false; // Mismatch found
            }
            start++;
            end--;
        }
        return true; // All characters matched
    }
}