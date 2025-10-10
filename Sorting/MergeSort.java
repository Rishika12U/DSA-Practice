class Solution {
public int[] mergeSortHelper(int[] nums, int si, int ei){
    if(si>=ei){
        return nums;
    }

        int mid = si+(ei-si)/2;

        mergeSortHelper(nums, si, mid);
        mergeSortHelper(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    
    return nums;
}

public static void merge(int[] nums, int si, int mid, int ei){
    int[] arr = new int[ei-si+1];
    int i= si;
    int j = mid+1;
    int k = 0;

    while(i<= mid && j <=ei){
        if(nums[i] < nums[j]){
            arr[k++] = nums[i++];
        }
        else{
            arr[k++] = nums[j++];
        }
    }
    while(i<=mid){
        arr[k++] = nums[i++];
    }
    while(j<= ei){
        arr[k++] = nums[j++];
    }

    for(k = 0, i=si; k<arr.length; k++, i++){
        nums[i] = arr[k];
    }
}

    public int[] mergeSort(int[] nums) {
     return mergeSortHelper(nums, 0, nums.length-1);
    }
}
