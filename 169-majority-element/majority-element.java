class Solution {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Find candidate
        for (int num : nums) {

            if (count == 0) {
                candidate = num;
                count = 1;
            }
            else if (num == candidate) {
                count++;
            }
            else {
                count--;
            }
        }

        // Verify candidate
        count = 0;

        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1;
    }
}