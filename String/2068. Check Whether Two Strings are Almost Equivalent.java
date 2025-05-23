//Solution 1
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int arr[] = new int[26];
        for(int i = 0 ; i < word1.length() ; i++){
            arr[word1.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < word2.length() ; i++){
            arr[word2.charAt(i) - 'a']--;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(Math.abs(arr[i]) > 3){
                return false;
            }
        }
        return true;
    }
}


//Solution 2
class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int arr[] = new int[26];
        for(int i = 0 ; i < word1.length() ; i++){
            arr[word1.charAt(i) - 'a']++;
            arr[word2.charAt(i) - 'a']--;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(Math.abs(arr[i]) > 3){
                return false;
            }
        }
        return true;
    }
}
