package College;

public class MatrixSearch {
	private static boolean searchMartix(int[][] matrix, int target)
	{
if(matrix.length ==0)
{
	return false;
}
	int numRows = matrix.length;
	int numCols = matrix[0].length;
	int left = 0,right = numRows*numCols -1;
	while(left <= right)
	{
		int mid = (left+right)/2;
		int midValue = matrix[mid/numCols][mid%numCols];
		if (target==midValue)
		{
			return true;
			
		}
		else if (target < midValue)
		{
			right = mid -1;
			
		}
		else {
			left = mid+1;
			
		}
	}
		return false;
	
	}
	public static void main(String args[])
	{
		int[][] matrix = {
				{1,4,9,11
		},
				{13,16,15,24},
				{28,30,38,50}};
		  int target = 5;
	        
	        System.out.println(searchMartix(matrix, 28));
	}
}
