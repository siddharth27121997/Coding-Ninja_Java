package TwoD_Array;
import java.util.*;
public class Reverse_A_2D_aaray {

	
	public static void reversea2d(int arr[][])
	{
		int rows=arr.length;
		//int start=0;
		int col=arr[0].length;
		for(int i=0;i<rows;i++)
		{
			int start=0;
			int end=col-1;
			while(start<end)
			{
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;
			
			start++;
			end--;
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner s= new Scanner(System.in);
	int row=s.nextInt();
	int col=s.nextInt();
	int arr[][]= new int[row][col];
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<col;j++)
		{
			arr[i][j]= s.nextInt();
		}
	}
	reversea2d(arr);
	
	}

}
