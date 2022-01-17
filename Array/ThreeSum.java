/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.*/
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length <= 2)
            return new ArrayList<>();
        int length = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<length; i++){
            if(i == 0 || (i>0 && nums[i] != nums[i-1])){
            int lo = i+1;
            int hi = length-1;
            int sum = 0- nums[i];
                while(lo<hi){
                    if(nums[lo] + nums[hi] == sum){
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[lo]);
                        temp.add(nums[hi]);
                        result.add(temp);
                        while(lo<hi && nums[lo] == nums[lo+1]) lo++;
                        while(lo<hi && nums[hi] == nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    }else if(nums[lo] + nums[hi] <= sum) lo++;
                    else hi--;
                }
            }
        }
        return result;
    }
}