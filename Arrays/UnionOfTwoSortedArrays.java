class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
      ArrayList<Integer> union = new ArrayList<>();
      int i = 0, j = 0;
      int n = nums1.length;
      int m = nums2.length;

      while(i < n && j < m){
        if(nums1[i] <= nums2[j]){
            if(union.size() == 0 ||union.get(union.size()-1) != nums1[i]){
                union.add(nums1[i]);
            } 
             i++;
        }else if(nums1[i] > nums2[j]){
            if(union.size() == 0 ||union.get(union.size()-1) != nums2[j]){
                union.add(nums2[j]);
            } 
             j++;
        }else{
             if(union.size() == 0 ||union.get(union.size()-1) != nums1[i]){
                union.add(nums1[i]);
            } 
             i++;
             j++; 
        }
      }
        while(i<n){
            if(union.size() == 0 || union.get(union.size()-1) != nums1[i]){
                union.add(nums1[i]);
            }
             i++;
        }
         while(j<m){
            if(union.size() == 0 ||union.get(union.size()-1) != nums2[j]){
                union.add(nums2[j]);
            }
             j++;
        }
        int[] ans = new int[union.size()];
        for(int k=0; k<ans.length; k++){
            ans[k] = union.get(k);
        }
        return ans;
    }
}
