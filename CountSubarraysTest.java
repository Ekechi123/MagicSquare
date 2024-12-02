public class CountSubarraysTest {

    public static void main(String[] args) {
        // Test case 1: arr1 = {1, 2, 3, 4, 5}, target = 5
        int[] arr1 = {1, 2, 3, 4, 5};
        int target1 = 5;
        int result1 = CountSubarrays.countUniqueSubarrays(arr1, target1);
        
        // Manually check if the result matches the expected outcome
        if (result1 == 2) {
            System.out.println("Test 1 passed: There should be 2 unique subarrays summing to 5.");
        } else {
            System.out.println("Test 1 failed: Expected 2 but got " + result1);
        }

        // Test case 2: arr2 = {1, 1, 1, 1}, target = 2
        int[] arr2 = {1, 1, 1, 1};
        int target2 = 2;
        int result2 = CountSubarrays.countUniqueSubarrays(arr2, target2);
        
        // Manually check if the result matches the expected outcome
        if (result2 == 6) {
            System.out.println("Test 2 passed: There should be 6 unique subarrays summing to 2.");
        } else {
            System.out.println("Test 2 failed: Expected 6 but got " + result2);
        }
        
        // Additional Test case 3: arr3 = {1, 2, 3, 4}, target = 10
        int[] arr3 = {1, 2, 3, 4};
        int target3 = 10;
        int result3 = CountSubarrays.countUniqueSubarrays(arr3, target3);
        
        // Manually check if the result matches the expected outcome
        if (result3 == 1) {
            System.out.println("Test 3 passed: There should be 1 unique subarray summing to 10.");
        } else {
            System.out.println("Test 3 failed: Expected 1 but got " + result3);
        }
        
        // Additional Test case 4: arr4 = {1, 1, 1, 1}, target = 4
        int[] arr4 = {1, 1, 1, 1};
        int target4 = 4;
        int result4 = CountSubarrays.countUniqueSubarrays(arr4, target4);
        
        // Manually check if the result matches the expected outcome
        if (result4 == 1) {
            System.out.println("Test 4 passed: There should be 1 unique subarray summing to 4.");
        } else {
            System.out.println("Test 4 failed: Expected 1 but got " + result4);
        }
    }
}

