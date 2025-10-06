class Solution {
public static boolean check(int[] nums, int k, int idx){
    if(k == 0) return true;

    if( k < 0) return false;

    if(idx == nums.length){
        return k == 0;
    }

   return (check(nums, k-nums[idx], idx+1) || check(nums, k, idx+1) ) ;
    
}

    public boolean checkSubsequenceSum(int[] nums, int k) {
       return check(nums, k, 0);
    }
}
