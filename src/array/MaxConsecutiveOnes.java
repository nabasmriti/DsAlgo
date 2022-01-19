package array;
/*Given a binary array nums, return the maximum number of consecutive 1's in the array.*/

class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len  = nums.length;
        int start =0;
        int end = 0;
        int maxLen = Integer.MIN_VALUE;
        int lenSoFar = 0;
        for(int i =0; i<len; i++ ){
            if(nums[i] == 1)
                lenSoFar++;
            else 
            {
                lenSoFar = 0;
               
            }
            if(maxLen < lenSoFar)
                maxLen = lenSoFar;
            
        }
        return maxLen;
    }
}