package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	 public List<List<Integer>> levelOrder(TreeNode root) {
	        Queue<TreeNode> q = new LinkedList<>();
	         List<List<Integer>> result = new ArrayList<>();
	        if(root == null)
	            return result;
	        q.add(root);
	        while(!q.isEmpty()){
	            int size = q.size();
	            List<Integer> l = new LinkedList<>();
	            for(int i =0; i<size; i++){
	                TreeNode node = q.remove();
	                l.add(node.val);
	                if(node.left != null)
	                    q.add(node.left);
	                if(node.right != null)
	                    q.add(node.right);
	            }
	            result.add(l);
	        }
	        return result;
	    }
}
