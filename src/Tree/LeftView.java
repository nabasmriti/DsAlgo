package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
	ArrayList<Integer> leftView(TreeNode root)
    {
      // Your code here
       Queue<TreeNode> q = new LinkedList<>();
       ArrayList<Integer> res = new ArrayList<>();
       if(root == null)
            return res;
         q.add(root);
         boolean flag = false;
	        while(!q.isEmpty()){
	             int size = q.size();
	              for(int i =0; i<size; i++){
	                TreeNode node = q.remove();
	                if(flag == false){
	                    res.add(node.val);
	                    flag = true;
	                }
	                if(node.left != null)
	                    q.add(node.left);
	                if(node.right != null)
	                    q.add(node.right);
	            }
	            flag = false;
	        }
	        return res;
    }
}
