package TwoD_Array;

import java.util.Scanner;

public class User_input {

	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows");
		int row= sc.nextInt();
		System.out.println("Enter the no. of columns");
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("Enter the element at"+i+ "Enter the element at" +j);
				arr[i][j]=sc.nextInt();
			}
			
		}
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println();
		}

	}

}
