class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1)
            return len;
        int s = 0, f = 1;
        while(f < len){
            if(nums[s] == nums[f])
                f++;
            else if(nums[s] != nums[f])
            {
                s++;
                int temp = nums[s];
                nums[s] = nums[f];
                nums[f] = temp;
                f++;
            }
        }
        return s+1;
    }
}