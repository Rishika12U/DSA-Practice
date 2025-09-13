class Solution {
    public int lowerBound(int[] nums, int x) {
       int low = 0;
       int high = nums.length-1;
       int ans = nums.length;

       while(low<=high){
        int mid = (low+high)/2;

        if(nums[mid] >= x){
            ans = mid;

            high = mid-1;
        }
        else if(nums[mid] < x){
            low = mid+1;
        }
       }
       return ans;
     }
}
