package Tree;

import java.util.*;

public class LevelOrderSpiral {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
       if(root == null)
           return result;
       q.add(root);
       boolean flag = false;
       while(!q.isEmpty()){
           int size = q.size();
           List<Integer> l = new LinkedList<>();
           Stack<Integer> st = new Stack<>();
           for(int i =0; i<size; i++){
               TreeNode node = q.remove();
               
               if(flag == false){
                  // flag = true;
                   l.add(node.val);
               }
               else{
                   st.push(node.val);
               }
               if(node.left != null)
                   q.add(node.left);
               if(node.right != null)
                   q.add(node.right);
           }
           while(!st.isEmpty()){
               l.add(st.pop());
           }
           flag = !flag;
           st = new Stack<>();
           result.add(l);
       }
       return result;
   }
}
