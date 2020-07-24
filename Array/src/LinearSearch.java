import java.util.Scanner;

public class LinearSearch {
	public static int linear_search(int arr[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value to be searched:");
		int val = sc.nextInt();
		for(int i =0;i<arr.length;i++)
		{ //break;
			if(val==arr[i])
			{
				return i;
				
			}
		}
		return -1;
	}
	public static int[] takeInput()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int size = sc.nextInt();
	int arr[]= new int[size];
	for(int i =0;i<size;i++)
	{
		arr[i]= sc.nextInt();
		
	}
	return arr;
		
	}
		
	public static void print(int arr[])
	{
		//int size= arr.length;
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		
	}
	public static void main(String[] args)
	{
		//System.out.println(arr);
		int arr[]= takeInput();
		System.out.println(arr);
		
		print(arr);
		int linear= linear_search(arr);
		System.out.println("Location:"+linear);
	}
}
	
	