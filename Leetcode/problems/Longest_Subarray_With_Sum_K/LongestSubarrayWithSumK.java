import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarrayWithSumK {
/*
    Constraints : 
        1. 1 <= arr.length <= 10^5
        2. -10^4 <= arr[i] <= 10^4
        3. -10^9 <= target_K <= 10^9
        4. Time Complexity: O(N)
        5. Space Complexity: O(N)
*/

/*

    Constraints : 
        1. 1 <= arr.length <= 10^5
        2. 0 <= arr[i] <= 10^4
        3. 0 <= target_K <= 10^9
        4. Time Complexity: O(N)
        5. Space Complexity: O(N)

-----Sliding Window-----

public static int longestSubarraySlidingWindow(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int currentSum = 0;
        int maxLength = 0;
        int n = arr.length;

        while (right < n) {
            // 1. Expand the window
            currentSum += arr[right];

            // 2. Shrink window while sum is too large
            // (Only valid because arr[i] >= 0)
            while (left <= right && currentSum > k) {
                currentSum -= arr[left];
                left++;
            }

            // 3. Check if we hit the target
            if (currentSum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
        }
        return maxLength;
    }
*/
    public static int longestSubarrayWithSizeK(int[] arr,int target_K){
        int max_length = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            sum = sum + arr[i];
            /* Case 1: Subarray starts from index 0 */
            if(sum == target_K){
                max_length = Math.max(max_length , i + 1);
            }
            int remaining = sum - target_K;
            /* Case 2: Subarray starts somewhere in the middle */
            if(map.containsKey(remaining)){
                max_length = Math.max(max_length , i - map.get(remaining));
            }
            /* Only add sum to map if it doesn't exist already. 
            This keeps the earliest index (longest distance).*/
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max_length;
    }
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("LongestSubarrayWithSumK.txt"))) {
            String line;
            int caseCount = 1;

            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) continue;

                // 1. Parse Array
                String[] parts = line.trim().split("\\s+");
                int[] arr = new int[parts.length];
                for (int i = 0; i < parts.length; i++) {
                    arr[i] = Integer.parseInt(parts[i]);
                }

                // 2. Parse Target K
                String targetLine = br.readLine();
                if (targetLine == null) break;
                int k = Integer.parseInt(targetLine.trim());

                // 3. Parse Expected Result
                String expectedLine = br.readLine();
                if (expectedLine == null) break;
                int expected = Integer.parseInt(expectedLine.trim());

                // 4. Run Logic
                int actual = LongestSubarrayWithSumK.longestSubarrayWithSizeK(arr, k);

                // 5. Output Result
                if (actual == expected) {
                    System.out.println("Test Case " + caseCount + ": [PASS]");
                } else {
                    System.out.println("Test Case " + caseCount + ": [FAIL]");
                    System.out.println("   Input: " + Arrays.toString(arr));
                    System.out.println("   Target: " + k);
                    System.out.println("   Expected: " + expected + ", Got: " + actual);
                }
                caseCount++;
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing data format: " + e.getMessage());
        }
    }
}
