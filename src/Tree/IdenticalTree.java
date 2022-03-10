package Tree;
/*Two binary trees are considered the same if they are structurally identical, 
 * and the nodes have the same value.*/
public class IdenticalTree {
	 public boolean isSameTree(TreeNode p, TreeNode q) {
	        if(p == null && q == null)
	            return true;
	        if(p == null || q== null )
	            return false;
	      
	        return (p.val == q.val) && isSameTree(p.left,q.left) && isSameTree(p.right , q.right);
	            
	            }
}
