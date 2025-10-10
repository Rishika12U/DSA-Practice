class Solution {
    public int singleNumber(int[] nums) {
        int i = 0;
        int ans = 0;
        while(i < nums.length){
        ans = ans ^ nums[i];
        i++;
        }
        return ans;
    }
}
