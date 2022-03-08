package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightView {
	  public List<Integer> rightSideView(TreeNode root) {
	        Queue<TreeNode> q = new LinkedList<>();
	       List<Integer> res = new ArrayList<>();
	       if(root == null)
	            return res;
	         q.add(root);
	         boolean flag = false;
		        while(!q.isEmpty()){
		             int size = q.size();
		              for(int i =0; i<size; i++){
		                TreeNode node = q.remove();
		               if(i == size - 1)
	                       res.add(node.val);
		                if(node.left != null)
		                    q.add(node.left);
		                if(node.right != null)
		                    q.add(node.right);
		            }
		           
		        }
		        return res;
	    }
}
