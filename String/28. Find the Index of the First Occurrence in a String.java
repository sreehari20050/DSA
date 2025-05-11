//Solution 1

class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

//Solution 2

class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ; i < (haystack.length() - needle.length()) + 1 ; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                if(haystack.substring(i, i + needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
