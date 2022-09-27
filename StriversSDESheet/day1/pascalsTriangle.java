class Solution {
    public List<List<Integer>> generate(int numRows)
    {
        List<List<Integer>> list = new ArrayList();
        List<Integer> rows = new ArrayList<>();

        for(int i =0; i< numRows; i++)
        {
            rows.add(0,1);
            for(int j=1; j<rows.size()-1; j++)
            {
                rows.set(j, rows.get(j)+rows.get(j+1));
                
               
            }
            list.add(new ArrayList<Integer>(rows));
        }
        return list;

    }
}
