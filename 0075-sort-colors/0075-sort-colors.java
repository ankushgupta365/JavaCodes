class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums.length ==1)return;
        
        //0 to low: 0, low to high: 1, high to end: 2
        int low=0,mid=0,high=nums.length-1,temp;
        while(mid<=high){
            switch(nums[mid]){
                case 0:
                    //swap mid with low and inc low and mid 
                    temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                   mid++;
                   break;
                case 2:
                    //swap mid with high and dec high
                     temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }
        
    }
}