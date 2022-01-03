package Array;

import java.util.ArrayList;

/*Given an integer array nums, find the contiguous subarray 
 * (containing at least one number) which has the largest sum and return its sum.
 * Kadane O(n) time and O(1) space*/
public class KadaneAlgorithm {
	public static int maxSubArray(int[] nums,ArrayList<Integer> subarray) { 
		int msf=nums[0] , meh=0 ; 
		int s=0;
		for(int i=0;i<nums.length;i++){ 
		meh+=nums[i]; 
		if(meh>msf)
		{ 
		    subarray.clear();
		    msf=meh; 
		    subarray.add(s); 
		    subarray.add(i); 
		    
		} 
		if(meh<0)
		{
		    meh=0; 
		    s=i+1;
		    
		} 
		} 
		 
		return msf; 
		} 
		    public static void main(String args[])
		    {
		        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		        ArrayList<Integer> subarray=new ArrayList<>();
		        int lon=maxSubArray(arr,subarray);
		        System.out.println("The longest subarray with maximum sum is "+lon);
		        System.out.println("The subarray is ");
		        for(int i=subarray.get(0);i<=subarray.get(1);i++)
		        {
		            System.out.print(arr[i]+" ");
		        }
		        
		    }
}

/* int maxTillNow =Integer.MIN_VALUE;
        int sum =0;
        int start =0;
        int end =0;
        int length = nums.length;
        if(length == 1 )
            return nums[0];
        for(int i =0; i< length; i++){
            sum+= nums[i];
            if(sum > maxTillNow){
                maxTillNow = Math.max(sum, maxTillNow);
               
                }
            if( sum <0){
                sum =0;
                       
               
            }
           
        }
        
        return maxTillNow;
    }*/
