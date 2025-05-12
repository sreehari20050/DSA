//Solution 1

class Solution {
    public char findTheDifference(String s, String t) {
        int total1 = 0;
        int total2 = 0; 
        for(int i = 0 ; i < s.length() ; i++){
            total1 += s.charAt(i);
        }
        for(int i = 0 ; i < t.length() ; i++){
            total2 += t.charAt(i);
        }
        return (char) Math.abs(total1 - total2);
    }
}

//Solution 2

class Solution {
    public char findTheDifference(String s, String t) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }

        return (char) result;
    }
}
