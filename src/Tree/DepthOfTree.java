package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class DepthOfTree {
	 public int maxDepth(TreeNode root) {
	        int depth =0;
	          Queue<TreeNode> q = new LinkedList<>();
		         //List<List<Integer>> result = new ArrayList<>();
		        if(root == null)
		            return 0;
		        q.add(root);
		        while(!q.isEmpty()){
		            int size = q.size();
		            //List<Integer> l = new LinkedList<>();
	                depth++;
		            for(int i =0; i<size; i++){
		                TreeNode node = q.remove();
		                //l.add(node.val);
		                if(node.left != null)
		                    q.add(node.left);
		                if(node.right != null)
		                    q.add(node.right);
		            }
		           // result.add(l);
		        }
		        return depth;
	    }
}
