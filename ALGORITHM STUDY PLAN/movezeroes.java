class Solution {
    public void moveZeroes(int[] nums)
    {
        int j=0;
        int[] brr = new int[nums.length];
        for (int num : nums) {
            if (num != 0) {
                brr[j] = num;
                j++;
            }
        }
        System.arraycopy(brr, 0, nums, 0, nums.length);

    }
}
