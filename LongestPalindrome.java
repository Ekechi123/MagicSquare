public class LongestPalindrome {

    // Function to find the longest palindromic substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, maxLength = 1;

        // Loop through the string
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome (expand from a single character)
            int len1 = expandFromCenter(s, i, i);
            // Even length palindrome (expand from two characters)
            int len2 = expandFromCenter(s, i, i + 1);

            // Get the maximum length between the two
            int len = Math.max(len1, len2);
            if (len > maxLength) {
                maxLength = len;
                start = i - (maxLength - 1) / 2;  // Set the start position of the palindrome
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, start + maxLength);
    }

    // Helper method to expand from the center and find the palindrome length
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;  // Return the length of the palindrome
    }

    public static void main(String[] args) {
        // Run the function with sample inputs and print results
        System.out.println("Longest Palindrome (babad): " + longestPalindrome("babad"));
        System.out.println("Longest Palindrome (cbbd): " + longestPalindrome("cbbd"));
    }
}

