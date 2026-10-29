class Solution {
    public int[] searchRange(int[] nums, int target) {
         int first = -1, last = -1;
        int left = 0, right = nums.length - 1;

        // Find first position
        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;

            if (nums[mid] == target)
                first = mid;
        }
      // Find last position
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;

            if (nums[mid] == target)
                last = mid;
        }

        return new int[]{first, last};
        
    }
}