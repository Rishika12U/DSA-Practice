class Solution {
public int[] Helper(int[] nums, int si, int ei){
    if(si >= ei){
        return nums;
    }
        int pIdx = partition(nums, si, ei);
        Helper(nums, si, pIdx-1);
        Helper(nums, pIdx+1, ei);
    
    return nums;
}
public int partition(int[] nums, int si, int ei){
    int pivot = nums[si];
    int i = si;
    int j = ei;

    while(i<=j){
        while(i<= ei && nums[i] <= pivot ){
            i++;
        }
        while(j >= si && nums[j] > pivot){
            j--;
        }
        if(i<j){
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
    nums[si] = nums[j];
    nums[j] = pivot;

    return j;
}

    public int[] quickSort(int[] nums) {
   return Helper(nums, 0, nums.length-1);
    }
}
