
public class Main {
	
	public static void main(String[] args){
		int [][]array = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		Solution solution= new Solution();
		int target = 5;
		boolean IsExist = solution.Find(target, array);
		System.out.println(IsExist);
		
	}

	
}