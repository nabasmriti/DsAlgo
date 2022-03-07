package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        List<Integer> preorder = new LinkedList<>();
         TreeNode node = root;
        while (true){
            if(node != null){
                preorder.add(node.val);
            if(node.right != null){
                st.push(node.right);
              //  node = node.right;
            }
             if(node.left != null){
                st.push(node.left);
             //   node = node.left;
            }
            }
            if(st.isEmpty())
                break;
             node = st.pop(); 
            
            
        }
        return preorder;
    }
}
