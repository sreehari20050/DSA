class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        long zero1 = 0;
        long zero2 = 0;
        for(int i : nums1){
            if(i == 0){
                sum1 += 1;
                zero1++;
            }
            sum1 += i;
        }
        for(int i : nums2){
            if(i == 0){
                sum2 += 1;
                zero2++;
            }
            sum2 += i;
        }
        if(zero1 == 0 && sum1 < sum2) return -1;
        if(zero2 == 0 && sum2 < sum1) return -1;
        return Math.max(sum1,sum2);
    }
}
