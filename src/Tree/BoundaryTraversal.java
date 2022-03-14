package Tree;

import java.util.ArrayList;

public class BoundaryTraversal {
	public static boolean isLeaf(TreeNode node){
        return (node.left == null && node.right == null);
            
    }
    public static void leftBoundary(TreeNode node ,  ArrayList<Integer> res ){
        TreeNode curr = node.left;
        while(curr != null){
            if(isLeaf(curr) == false)
                res.add(curr.val);
            curr = curr.left!= null ? curr.left: curr.right;
        }
    }
     public static void leaf(TreeNode node ,  ArrayList<Integer> res ){
          TreeNode curr = node;
         if(isLeaf(curr)){
             res.add(curr.val);
         }
         if(curr.left != null) 
             leaf(curr.left,res);
         if(curr.right != null) 
             leaf(curr.right,res);
     }
        public static void rightBoundary(TreeNode node ,  ArrayList<Integer> res ){
        TreeNode curr = node.right;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while(curr != null){
            if(isLeaf(curr) == false)
                temp.add(curr.val);
            curr = curr.right!= null ? curr.right: curr.left;
        }
            for(int i = temp.size() -1; i>= 0; i--){
                res.add(temp.get(i));
            }
    }
	public static void traverseBoundary(TreeNode root){
		// Write your code here.
        ArrayList<Integer> res = new ArrayList<>();
        try {
			if(isLeaf(root) == false)
			    res.add(root.val);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        leftBoundary(root,res);
        leaf(root,res);
        rightBoundary(root,res);
        
	}
}
