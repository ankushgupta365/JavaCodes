class Solution {
    public int maxSubArray(int[] nums) {
        //kadane's algorithm  //time O(n) space O(1)
        int curSum = nums[0];   //cuurent sum
        int overSum = nums[0];  //overall sum
        for(int i=1; i<nums.length; i++){
            if(curSum>=0){
                curSum+=nums[i];
            }else{
                curSum = nums[i];
            }
            if(curSum>overSum)
                overSum = curSum;
        }
        return overSum;
    }
}