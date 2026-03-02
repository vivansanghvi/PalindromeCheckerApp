/**
 * UC13: Performance Comparison
 * Description:
 * This class validates a palindrome using recursion.
 * Characters are compared from the outer positions moving inward using recursive calls.
 * The recursion stops when all characters are matched or a mismatch is found.
 * * @author Vivan
 * @version 12.0
 */

mport java.util.*;

public class UseCase13PalindromeCheckerApp {

  
    public static boolean twoPointerCheck(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackCheck(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }


    public static boolean recursiveCheck(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return recursiveCheck(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison of Palindrome Algorithms ===");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();


        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();


        long start3 = System.nanoTime();
        boolean result3 = recursiveCheck(normalized, 0, normalized.length() - 1);
        long end3 = System.nanoTime();

        System.out.println("\n--- Results ---");
        System.out.println("Two-Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nStack Method Result: " + result2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nRecursive Method Result: " + result3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}
