class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1; int j=n-1; int k;
        for(k=m+n-1; k>=0 && j>=0 && i>=0; k--){
            if(nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else{
                nums1[k] = nums2[j];
                j--;
            }
        }
        while(j>=0){
            nums1[j] = nums2[j];
            j--;
        }
    }
}