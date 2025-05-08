class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x > 0 && x % 10 == 0)){
            return false;
        }
        int y = 0;
        int temp = x;
        while(temp > 0){
            y = (y * 10) + (temp % 10);
            temp = temp / 10;
        }
        if(x == y) return true;
        else return false;
    }
}
