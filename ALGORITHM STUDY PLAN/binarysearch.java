class  Solution
{
   public int search(int[] arr, int x) {
     int n = arr.length-1;
        int p = 0;
        int m = ((p + n) / 2) + p ;
        while (p <= n)
        {
            if (arr[m] == x)
            {

                return m;
            }
            else if (arr[m] > x) {
                n = m - 1;

            } else {
                p = m+ 1;

            }
            m = (p + n) /2;
        }
        return -1;
    }

}
