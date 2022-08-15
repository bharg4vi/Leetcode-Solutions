class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length - 1;

       
        if (target < nums[left] || target == nums[left])
        {
            return left;
        }
        if (target > nums[right]) 
        {
            return right + 1;
        }
        if (target == nums[right]) 
        {
            return right;
        }

        int mid = (left + right) / 2;
        while (left <= right) {
            if (nums[mid] == target) 
            
            {
                return mid;
            }

            if (target > nums[mid]) 
            
            {
               
                left = mid + 1;
            }

            if (target < nums[mid]) 
            {
             
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }

        return mid + 1;
    }
}
