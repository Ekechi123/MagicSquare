# Java Algorithms Project

## Description
This project implements three key algorithms in Java:
1. **Magic Square**: Checks if a 2D matrix is a magic square.
2. **Longest Palindromic Substring**: Finds the longest palindromic substring in a string.
3. **Count Unique Subarrays**: Counts the number of unique subarrays that sum to a given value.

## Objective
The objective is to:
- Implement a static method to check if a 2D matrix is a magic square.
- Count the number of unique subarrays summing to a target value.
- Find the longest palindromic substring in a string.

## Features
- **Magic Square Check**: Verifies if a given matrix is a magic square.
- **Longest Palindrome**: Finds the longest palindromic substring in a given string.
- **Unique Subarrays Count**: Counts unique subarrays summing to a specified target.

## Installation & Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-project.git
   
## Compile the Java files:
javac MagicSquare.java MagicSquareTest.java LongestPalindrome.java LongestPalindromeTest.java CountSubarrays.java CountSubarraysTest.java

## Run the tests:
java MagicSquareTest
java LongestPalindromeTest
java CountSubarraysTest
Usage

## Magic Square Test:

int[][] matrix = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
System.out.println(MagicSquare.isMagicSquare(matrix)); // true

## Longest Palindrome:
String result = LongestPalindrome.longestPalindrome("babad");
System.out.println(result); // "bab" or "aba"

## Count Unique Subarrays:
int[] arr = {1, 2, 3, 4, 5};
int target = 5;
System.out.println(CountSubarrays.countUniqueSubarrays(arr, target)); // 2
Testing

Run the test classes to verify the implementation:

Magic Square Test:
java MagicSquareTest
Longest Palindrome Test:
java LongestPalindromeTest
Count Unique Subarrays Test:
java CountSubarraysTest
