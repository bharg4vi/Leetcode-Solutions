class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freqn[] = new int[26], freqm[] = new int[26], n = s1.length(), m = s2.length(), counter = 0, i = 0, j = 0, discreteNum = 0;
        char a[] = s1.toCharArray(), b[]= s2.toCharArray();
        for(i=0;i<n;i++){
            if(freqn[a[i]-'a'] == 0) discreteNum++;
            freqn[a[i]-'a']++;
        }
        for(i=j=0;j<m;j++){
            if((j-i) == n){
                if(freqm[b[i]-'a']==freqn[b[i]-'a'] && freqn[b[i]-'a']!=0) counter--;
                freqm[b[i]-'a']--;
                i++;
            }
            freqm[b[j]-'a']++;
            if(freqm[b[j]-'a']==freqn[b[j]-'a'] && freqn[b[j]-'a']!=0) counter++;
            if(counter==discreteNum) return true;
        }
        return false;
    }
}
