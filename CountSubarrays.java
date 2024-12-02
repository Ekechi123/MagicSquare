public class CountSubarrays {

    // Method to count the unique subarrays that sum to a given target value
    public static int countUniqueSubarrays(int[] arr, int target) {
        // Array to store string representations of unique subarrays
        String[] uniqueSubarrays = new String[arr.length * (arr.length + 1) / 2];
        int uniqueCount = 0;  // Counter to track the number of unique subarrays

        int n = arr.length;

        // Loop through all possible subarrays
        for (int start = 0; start < n; start++) {
            int sum = 0;

            // Loop to generate subarrays starting at each position `start`
            for (int end = start; end < n; end++) {
                sum += arr[end];

                // Check if the sum of the current subarray equals the target
                if (sum == target) {
                    // Generate the string representation of the current subarray
                    String subarray = arrayToString(arr, start, end);

                    // Check if the subarray is already in the uniqueSubarrays array
                    boolean isDuplicate = false;
                    for (int i = 0; i < uniqueCount; i++) {
                        if (uniqueSubarrays[i].equals(subarray)) {
                            isDuplicate = true;
                            break;
                        }
                    }

                    // If it's not a duplicate, add it to the uniqueSubarrays array
                    if (!isDuplicate) {
                        uniqueSubarrays[uniqueCount] = subarray;
                        uniqueCount++;
                    }
                }
            }
        }

        // Return the count of unique subarrays
        return uniqueCount;
    }

    // Helper method to convert subarray to a string representation
    private static String arrayToString(int[] arr, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(arr[i]).append(",");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test case for demonstration
        int[] arr = {1, 2, 3, 4, 5};
        int target = 5;
        System.out.println("Unique subarrays summing to " + target + ": " + countUniqueSubarrays(arr, target));
    }
}

