class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        int count = Integer.bitCount(n);
        if(count == 1){
            return true;
        }
        return false;
    }
}


//solution 2
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        while(n != 1){
            if(n % 2 != 0){
                return false;
            }
            else{
                n = n / 2;
            }
        }
        return true;
    }
}
