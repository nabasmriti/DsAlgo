package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PostOrderTraversal {
	 public List<Integer> postorderTraversal(TreeNode root) {
	        Stack<TreeNode> st1 = new Stack<>();
	        Stack<TreeNode> st2 = new Stack<>();
	        List<Integer>  postOrder = new LinkedList<>();
	        TreeNode node = root;
	        st1.push(node);
	        if(root == null)
	            return postOrder;
	        while(!st1.isEmpty()){
	            node = st1.pop();
	            st2.push(node);
	            if(node.left != null)
	                st1.push(node.left);
	            if(node.right != null)
	                st1.push(node.right);
	        }
	        while(!st2.isEmpty())
	            postOrder.add(st2.pop().val);
	        return postOrder;
	    }
}
