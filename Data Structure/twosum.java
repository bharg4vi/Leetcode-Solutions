class Solution 
{
public int[] twoSum(int[] nums, int target) 
{
Map<Integer, Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++)
    {
           int expected = target - nums[i];
        if (!map.containsKey(expected))
            map.put(nums[i], i);
        else return new int[]{map.get(expected), i};
    }
    return new int[]{0, 0};
}
}
