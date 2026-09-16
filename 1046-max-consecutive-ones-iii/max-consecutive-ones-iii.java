class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeros = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Count zero when it enters the window
            if (nums[right] == 0) {
                zeros++;
            }

            // If we have more than k zeros,
            // shrink the window from the left
            while (zeros > k) {

                if (nums[left] == 0) {
                    zeros--;
                }

                left++;
            }

            // Current window length
            int length = right - left + 1;

            // Store the maximum length
            maxLength = Math.max(maxLength, length);
        }

        return maxLength;
    }
}