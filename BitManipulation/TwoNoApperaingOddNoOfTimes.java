class Solution {    
    public int[] singleNumber(int[] nums) {   
        int arr[] = new int[2]; 
        long xor = 0;    
       for(int i=0; i<nums.length; i++){
   xor = xor ^ nums[i];
       }
       int right = (int)(xor & (xor-1)) ^ (int)xor;
       int b1 = 0, b2 = 0;
       for(int i=0; i<nums.length; i++){
        if((right & nums[i]) != 0){
            b1 = b1^ nums[i];
        }else{
            b2 = b2 ^ nums[i];
        }
       }
      if(b1 < b2) return new int[]{b1, b2};
      return new int[]{b2,b1};
    }
}
