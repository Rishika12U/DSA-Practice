//Rotating to Right By k Elements
class Solution {
    public void Reverse(int[] nums, int first, int last){

        while(first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first++;
            last--;
        }
    }
    public void rotate(int[] nums, int k) {
     int n = nums.length;

    k = k % n;

     Reverse(nums, 0, n-k-1);
     Reverse(nums, n-k, n-1);
     Reverse(nums, 0, n-1);
    }
}

//Rotate to left By k Elements
class Solution {
public void Reverse(int[] nums, int first, int last){
    while(first < last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        first++;
        last--;
    }
}

    public void rotateArray(int[] nums, int k) {
        int n = nums.length;

        k = k % n;
        Reverse(nums, 0, k-1);
        Reverse(nums, k, n-1);
        Reverse(nums, 0, n-1);
    }
}
