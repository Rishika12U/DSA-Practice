class BinarySearch {
public static int binarySearch(int nums[], int low, int high, int target){
    if(low > high)return -1;

    int mid = (high+low)/2;
    if(nums[mid] == target)return mid;

    else if(nums[mid] < target){
        return binarySearch(nums, mid+1, high, target);
    }
    else{
        return binarySearch(nums, low, mid-1, target);
    }
}

    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }


public static void main(String args[]){
    int nums[] = {2,7, 9, 11, 15, 20, 55, 91};
    int target = 20;

    System.out.println(search(nums, target));
}
}
