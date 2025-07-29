class Solution {
    public boolean isSorted(ArrayList<Integer> nums) {
        for(int i = 0; i<nums.length-1; i++){
            if(nums.charAt(i) > nums.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}