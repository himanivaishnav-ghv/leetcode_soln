class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            // Width between the two lines
            int width = right - left;

            // Water level is decided by the shorter line
            int minHeight = Math.min(height[left], height[right]);

            // Calculate water
            int area = width * minHeight;

            // Update maximum
            maxWater = Math.max(maxWater, area);

            // Move the pointer having smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }
}