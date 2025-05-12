class Solution {
    public boolean isBalanced(String num) {
        int esum = 0;
        int osum = 0;
        for(int i = 0 ; i < num.length() ; i++){
            int val = num.charAt(i) - '0';

            if(i % 2 == 0){
                esum += val;
            }
            else{
                osum += val;
            }
        }
        if(esum == osum) return true;
        else return false;
    }
}
