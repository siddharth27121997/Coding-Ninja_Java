package TwoD_Array;

public class Row_wisesum {

	public static void row_wise(int arr[][])
	{
		int row= arr.length;
		int col= arr[0].length;
		for(int i=0;i<row;i++)
		{
			int sum=0;
			for(int j=0;j<col;j++)
			{
				sum+=arr[i][j];
			}
		System.out.println(sum+" ");	
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{3,3,2},{3,1,3}};
		row_wise(arr);
		
		
	}

}
