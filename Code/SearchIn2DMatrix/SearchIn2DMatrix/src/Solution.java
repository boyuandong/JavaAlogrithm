
public class Solution {
	public Solution Solution() {
		// TODO Auto-generated method stub
		return null;
	}
	 public boolean Find(int target, int [][] array) {
	        int rows = array.length;
	        if(rows <=0){
	            return false;
	        }
	        int cols = array[0].length;
	        if (cols <=0){
	            return false;
	        }
	        int row = rows-1;
	        int col = 0;
	        while (row >=0 && col < cols){
	            if(array[row][col] == target){
	                return true;
	            }else if(array[row][col] < target){
	                col++;
	            }else{
	                row--;
	            }
	        }
	        return false;
	    }


}




