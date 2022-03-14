package Tree;

import java.util.ArrayList;

public class RootToNodePath {
	   public boolean getRootToNode(TreeNode A, int B,ArrayList<Integer> result){
	        if(A == null)
	            return false;
	        result.add(A.val);
	        if(A.val == B)
	            return true;
	        if(getRootToNode(A.left,B,result)||getRootToNode(A.right,B,result))
	            return true;
	        
	        result.remove(result.size() -1);
	        return false;
	    }
	    public int[] solve(TreeNode A, int B) {
	      //  int [] result = new int[10];
	      ArrayList<Integer> result  = new ArrayList<>();
	        boolean res = getRootToNode(A,B,result);
	        int [] result1 = new int[result.size()];
	        int i = 0;
	         for (Integer n : result) {
	        result1[i++] = n;
	    }
	        return result1;
	    }
}
