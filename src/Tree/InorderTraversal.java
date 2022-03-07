package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {
	 public List<Integer> inorderTraversal(TreeNode root) {
	        List<Integer> inorder = new LinkedList<>();
	        Stack<TreeNode> st = new Stack<>();
	        TreeNode node = root;
	        while(true){
	            if(node != null){
	                st.push(node);
	                node = node.left;
	                
	            }else{
	                if(st.isEmpty())
	                    break;
	                node = st.pop();
	                inorder.add(node.val);
	                node = node.right;
	            }
	        }
	        return inorder;
	    }
}
