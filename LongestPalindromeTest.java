public class LongestPalindromeTest {

    public static void main(String[] args) {
        // Test case 1: Input "babad"
        String input1 = "babad";
        String result1 = LongestPalindrome.longestPalindrome(input1);
        if (result1.equals("bab") || result1.equals("aba")) {
            System.out.println("Test 1 passed: Longest palindrome for 'babad' is " + result1);
        } else {
            System.out.println("Test 1 failed: Expected 'bab' or 'aba', but got " + result1);
        }

        // Test case 2: Input "cbbd"
        String input2 = "cbbd";
        String result2 = LongestPalindrome.longestPalindrome(input2);
        if (result2.equals("bb")) {
            System.out.println("Test 2 passed: Longest palindrome for 'cbbd' is " + result2);
        } else {
            System.out.println("Test 2 failed: Expected 'bb', but got " + result2);
        }

        // Test case 3: Input "a"
        String input3 = "a";
        String result3 = LongestPalindrome.longestPalindrome(input3);
        if (result3.equals("a")) {
            System.out.println("Test 3 passed: Longest palindrome for 'a' is " + result3);
        } else {
            System.out.println("Test 3 failed: Expected 'a', but got " + result3);
        }

        // Test case 4: Input "ccc"
        String input4 = "ccc";
        String result4 = LongestPalindrome.longestPalindrome(input4);
        if (result4.equals("ccc")) {
            System.out.println("Test 4 passed: Longest palindrome for 'ccc' is " + result4);
        } else {
            System.out.println("Test 4 failed: Expected 'ccc', but got " + result4);
        }
    }
}

