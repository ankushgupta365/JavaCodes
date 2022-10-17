class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i,j;
        //base case
        if(n<=1){
            return;
        }
        //from end finding the pivot where no. no longer follow increasing order
        for(i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1])
                break;
        }
        
        if(i<0){
            reverse(nums,0,nums.length-1);
        }else{
            //find the greater element then the pivot element in the subarray after pivot,                     traversing from end
            for(j=n-1; j>i; j--){
                if(nums[j]>nums[i]){
                    swap(nums,i,j);
                    break;
                }
            }
            reverse(nums,i+1,n-1);
        }
        
    }
    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}