class Solution {
    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // We are on the decreasing side
                // Peak is at mid or somewhere on the left
                high = mid;
            } else {
                // We are on the increasing side
                // Peak is somewhere on the right
                low = mid + 1;
            }
        }

        return low;
    }
}