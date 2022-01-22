package GreedyAlgorithm;

/*There is one meeting room in a firm. There are N meetings in the form of (start[i], end[i]) where start[i] is start time of meeting i and end[i] is finish time of meeting i.
What is the maximum number of meetings that can be accommodated in the meeting room when only one meeting can be held in the meeting room at a particular time?

Note: Start time of one chosen meeting can't be equal to the end time of the other chosen meeting.*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class meet{
    int start = 0;
    int end = 0;
    int pos =0;
    meet(int s, int e, int p){
        start = s;
        end = e; pos = p;
    }
    
}

class meetComparator implements Comparator<meet>{
   @Override
   public int compare(meet o1, meet o2){
       if(o1.end<o2.end)
        return -1;
       else if(o1.end>o2.end)
        return 1;
       else if(o1.pos<o2.pos)
        return -1;
       return 1;
       
   }
}

class NMeetingsOneRoom 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
   
    public static int maxMeetings(int start[], int end[], int n)
    {
       ArrayList<meet> meeting = new ArrayList<>();
       
       for(int i=0; i<start.length; i++){
           meeting.add(new meet(start[i],end[i],i+1));
       }// add your code here
       
       meetComparator mc = new meetComparator();
       Collections.sort(meeting,mc);
       int count =1;
       
       for(int i=1; i<start.length; i++){
           if(start[i]<=end[i-1])
                count++;
       }
       return count;
    }
}