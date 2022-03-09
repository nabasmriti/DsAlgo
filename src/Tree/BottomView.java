package Tree;
import java.util.*;

public class BottomView {
	
	  class Node1{
	        int row;
	       
	        Node node;
	        public Node1(Node _node, int _row){
	            this.row = _row;
	            node = _node;
	        }
	    }
  public ArrayList <Integer> bottomView(Node root)
  {
      // Code here
       TreeMap<Integer,Integer> map = new TreeMap<>();
	        ArrayList<Integer> result = new ArrayList<>();
	        Queue<Node1> q = new LinkedList<>();
	        q.offer(new Node1(root,0));
	        while(!q.isEmpty()){
	            Node1 n = q.poll();
	            Node n1 = n.node;
	            int x = n.row;
	           
	            if(!map.containsKey(x))
	                map.put(x,n1.data);
	            else{
	                map.remove(x);
	                map.put(x,n1.data);
	            }
	            
	            if(n1.left != null)
	                q.offer(new Node1(n1.left,x-1));
	            if(n1.right != null)
	                q.offer(new Node1(n1.right, x+1));
	        }
	        
	        for(Integer ys : map.values()){
	            result.add(ys);
	           
	            }
	        
	        return result;
  }
}
