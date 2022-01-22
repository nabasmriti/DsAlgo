package GreedyAlgorithm;

import java.util.Arrays;
/*Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting.
Consider that all the trains arrive on the same day and leave on the same day. Arrival and departure time can never be the same for a train but we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. 
In such cases, we need different platforms.*/
class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
        Arrays.sort(dep);// add your code here
        int res =1;
        int i =1, j=0;
        int plat_needed =1;
        while(i<n && j<n){
            if(arr[i]<= dep[j]){
                plat_needed++;
                i++;
            }
            else if(arr[i]> dep[j]){
                plat_needed--;
                j++;
            }
            res = Math.max(res,plat_needed);
        }
        return res;
    }
    
}
