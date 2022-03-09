package Tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class VerticalOrderTraversal {
	 class Node{
	        int row;
	        int col;
	        TreeNode node;
	        public Node(TreeNode _node, int _row, int _col){
	            this.row = _row;
	            this.col = _col;
	            node = _node;
	        }
	    }
	    public List<List<Integer>> verticalTraversal(TreeNode root) {
	        TreeMap<Integer,TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
	        List<List<Integer>> result = new LinkedList<>();
	        Queue<Node> q = new LinkedList<>();
	        q.offer(new Node(root,0,0));
	        while(!q.isEmpty()){
	            Node n = q.poll();
	            TreeNode n1 = n.node;
	            int x = n.row;
	            int y = n.col;
	            if(!map.containsKey(x))
	                map.put(x,new TreeMap<>());
	            if(!map.get(x).containsKey(y))
	                map.get(x).put(y,new PriorityQueue<>());
	            map.get(x).get(y).offer(n1.val);
	            
	            if(n1.left != null)
	                q.offer(new Node(n1.left,x-1,y+1));
	            if(n1.right != null)
	                q.offer(new Node(n1.right, x+1, y+1));
	        }
	        
	        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()){
	            result.add(new LinkedList<>());
	            for(PriorityQueue<Integer> nodes : ys.values()){
	                while(!nodes.isEmpty()){
	                    result.get(result.size() - 1).add(nodes.poll());
	                }
	            }
	        }
	        return result;
	    }
}
