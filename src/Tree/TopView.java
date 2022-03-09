package Tree;
import java.util.*;

public class TopView {
	 static ArrayList<Integer> topView(Node root)
	    {
	        // add your code
	        //Node1 ob = new Node1();
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
