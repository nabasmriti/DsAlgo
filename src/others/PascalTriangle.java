package others;

import java.util.LinkedList;
import java.util.List;

/*
 * Below solution prints Pascal triangle
 * 1. Also try returning nth row
 * 2. Also try returning rth row nth element*/

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row, prev = null;
        List<List<Integer>> result = new LinkedList<>();
        for(int i =0; i<numRows ; i++){
            row = new LinkedList<>();
            for(int j =0 ; j<=i; j++){
                if(j == 0 || j == i)
                    row.add(1);
                else{
                    row.add(prev.get(j-1)+prev.get(j));

                }
            }
            result.add(row);
            prev = row;
        }
        return result;
    }
}