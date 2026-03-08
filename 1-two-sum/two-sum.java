class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {        // primer loop (i)

            for (int j = i + 1; j < nums.length; j++) { // segundo loop (j)

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }

        }

        return new int[]{};
    }
}