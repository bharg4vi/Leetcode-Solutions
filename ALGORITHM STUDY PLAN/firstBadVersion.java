public class Solution extends VersionControl 
{
    public int firstBadVersion(int n) 
    {
        int start=1;
        int end=n;
       
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            
            if(isBadVersion(mid))
            {
                if(isBadVersion(mid-1)==false)
                {
                    return mid;
                }
                end=mid;
            }
            else
            {
                
                if(isBadVersion(mid+1)==true)
                {
                    return mid+1;
                }
                start=mid;
            }
        }
        return -1;
    }
}
