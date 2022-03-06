package String;

public class ReverseWordsInString {
	 public String reverseWords(String s) {
         int start = 0;
   int end = s.length() -1;
      boolean flag =  false;
           
       String ans = "", temp = "";
        if(s.charAt(end) == ' ')
            end--;
       while(start <= end){
           if(s.charAt(start) != ' ' ){
             
               temp += s.charAt(start);
               if(flag == true)
                   flag = false;
              
           }else if(s.charAt(start) == ' ' && flag == false) {
              
                   
               if(ans.equals("")){
                   ans = temp;
               }else{
                   
                 
                   ans = temp + " " + ans;
                
                  
               }
                temp = "";
                flag = true;
               
           }
        
            start++;
           
       }
        if(!temp.equals("")){
                 
            if(ans.equals("")){
                   ans = temp;
               }else{
                   
                 
                   ans = temp + " " + ans;
                  
                  
               }
           }
       return ans;
   }
}


