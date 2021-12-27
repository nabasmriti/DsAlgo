package matrix;
/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

    Integers in each row are sorted from left to right.
    The first integer of each row is greater than the last integer of the previous row.
*/
public class SearchIn2DMatrix {

	 public boolean searchMatrix(int[][] matrix, int target) {
	        int row = matrix.length;
	        int col = matrix[0].length;
	        if(row == 1 && col == 1 && matrix[0][0] == target)
	            return true;
	        else if(row == 1 && col == 1 && matrix[0][0] != target)
	            return false;
	        else{
	            
	        for(int i =0; i< row; i++){
	           
	                if(target>= matrix[i][0] && target<= matrix[i][col-1])
	                   {
	                        for(int j =0 ; j< col; j++){
	                            if(matrix[i][j] == target)
	                                return true;
	                        }
	                       return false;
	                   }
	            
	        }
	    }
	                
	    return false;
	    }
}
