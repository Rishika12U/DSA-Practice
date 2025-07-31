//Time Complexity => O(N)
// Space Complexity => O(N)

class Solution {
    public int longestSubarray(int[] nums, int k) {
       int n = nums.length;
       long sum = 0;
       int maxLen = 0;

       HashMap<Long, Integer> map = new HashMap<>();

       for(int i=0; i<n; i++){
        sum = sum + nums[i];

        if(sum == k){
            maxLen = Math.max(maxLen, i+1); 
        }

        long rem = sum - k;

      if(map.containsKey(rem)){
        maxLen = Math.max(maxLen, i-map.get(rem));
      }
    if(!map.containsKey(sum)){
        map.put(sum, i);
    }
       }
       return maxLen;
    }
}
