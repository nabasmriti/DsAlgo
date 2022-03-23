package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayWithStackOperations {
	public List<String> buildArray(int[] target, int n) {
        List<String> ar = new ArrayList<>();
        int j =0;
        for(int i =1; i<=n && j<target.length ; i++){
            ar.add("Push");
            if(target[j] == i)
                j++;
            else
                ar.add("Pop");
        }
        return ar;
        
    }
}
