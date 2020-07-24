package TwoD_Array;

public class Reverse_row_of_a_2D {

	public static void reverse(int arr[][])
	{
		int rows=arr.length;
		int col=arr[0].length;
		for(int i=0;i<rows;i++)
		{
			int start=0;
			int end=col-1;
			while(end!=0)
			{
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;
			
			start++;
			end--;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,2,3},{4,5,6}};
		
	reverse(arr);
	int rows=arr.length;
	int col=arr[0].length;
	
	for(int i=0;i<rows;i++)
	{
		for(int j=0;j<col;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	}

}
