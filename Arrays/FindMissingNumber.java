class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int currSum = 0;
       int totalSum = 0;

       for(int i=0; i<nums.length; i++){
         currSum += nums[i];
       } 

        totalSum = (n*(n+1))/2;

        return totalSum-currSum;
    }
}
