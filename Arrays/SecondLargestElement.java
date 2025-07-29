class Solution {
    public int secondLargestElement(int[] nums) {
    if(nums.length < 2){
            return -1;
        }
        int max = nums[0];
        int secMax = -1;
        for(int i=0; i< nums.length; i++){
            if(nums[i] > max){
                secMax = max;
                max = nums[i];
            }
            else if(nums[i] > secMax && nums[i] != max){
                secMax = nums[i];
            }
        }
        return secMax;
    }
}