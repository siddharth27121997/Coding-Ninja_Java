package TwoD_Array;

import java.util.Scanner;

public class Reverse_a_columnof2Darray {
	
	public static void reverse(int arr[][])
	{
		int row=arr.length;
		int col=arr[0].length;
		for(int j=0;j<arr.length;j++)
		{
			int start=0;
			int end=row-1;
			while(start<end)
			{
				int temp=arr[start][j];
				arr[start][j]=arr[end][j];
				arr[end][j]=temp;
				start++;
				end--;
			}
		}
		for(int i =0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Scanner sc = new Scanner(System.in);
		int row= sc.nextInt();
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		reverse(arr);
	}

}
