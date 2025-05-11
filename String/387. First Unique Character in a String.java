class Solution {
    public int firstUniqChar(String s) {
       int[] frequency = new int[26];
       char[] charr = s.toCharArray();
       for(char c : charr){
        frequency[c - 'a']++;
       } 
       for(int i = 0 ; i < s.length() ; i++){
        if(frequency[charr[i] - 'a'] == 1){
            return i;
        }
       }
       return -1;
    }
}
