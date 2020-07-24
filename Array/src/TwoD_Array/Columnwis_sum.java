package TwoD_Array;

public class Columnwis_sum {

	
	
	public static void column_wise(int arr[][])
	{
		
		int row=arr.length;
		int col=arr[0].length;
		for(int j=0;j<col;j++)
		{
			int sum=0;
			int start=0;
			//int end=row-1;
			while(start<row)
			{
				sum=sum+arr[start][j];
			start++;
			
			}
			System.out.println(sum);
		}
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{3,4,5}};
		column_wise(arr);
	}

}
