class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find the maximum number of bananas in a pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        // Binary search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate total hours needed at speed 'mid'
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= h) {
                // Speed is possible, try a smaller speed
                high = mid - 1;
            } else {
                // Speed is too slow, increase it
                low = mid + 1;
            }
        }

        return low;
    }
}