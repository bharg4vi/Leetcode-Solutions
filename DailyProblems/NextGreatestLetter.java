class Solution {
    public char nextGreatestLetter(char[] letters, char target) 
    {
        for(int i =0; i < letters.length; i++)
        {
            if(letters[i]  > target )
            {                
                return letters[i];
            }
        }
        return letters[0];
                
    }
}
public class NextGreatestLetter {
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        char result = sol.nextGreatestLetter(letters, target);
        System.out.println(result);
    }
}
