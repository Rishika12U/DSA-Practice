//Brute Force  
class Solution {
    public int removeDuplicates(int[] nums) {
    TreeSet <Integer> set = new TreeSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
       int k = set.size();
       int j = 0;
       for(Integer x : set){
         nums[j++] = x;
       }
       return k;
    }
}

// Optimal Solution
class Solution {
    public int removeDuplicates(int[] nums) {
    int j = 0;
    for(int i=1; i< nums.length; i++){
    if(nums[j] != nums[i]){
       j++;
       nums[j] = nums[i];
    }
    }
    return j+1;
    }
}
