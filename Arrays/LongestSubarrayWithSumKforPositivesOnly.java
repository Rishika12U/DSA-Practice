//Two Pointer Approach
//Time Complexity => O(2N)

class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
       int left = 0;
       int right = 0;
       long sum = nums[0];
       int maxLen = 0;

       while(right < n){
      
      while(left<=right && sum > k){
        sum = sum -  nums[left];
        left++;
      }
      if(sum == k){
        maxLen = Math.max(maxLen, right-left+1);
      }
      right++;
      if(right < n){
      sum = sum + nums[right];
      }
       }
  return maxLen;
    }
}
