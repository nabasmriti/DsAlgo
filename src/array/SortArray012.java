package array;

/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.*/

class SortArray012{
    public void sortColors(int[] nums) {
        // base case
        if(nums.length==0 || nums.length==1) return;
        // Initializing low, mid and high 
        int low = 0, mid = 0, high = nums.length-1;
        while(mid <= high){
            int temp;
            switch (nums[mid]){
                case 0 :
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1 :
                    mid++;
                    break;
                case 2 :
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;   
            }
        }
    }
}
