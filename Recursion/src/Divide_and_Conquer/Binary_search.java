package Divide_and_Conquer;

public class Binary_search {
	
	
	public static int binary_search(int arr[],int x)
	{
		int end=arr.length-1;
		return binary_search(arr,0,end,x);
	}
	public static int binary_search(int arr[],int start, int end,int x)
	{
		//int mid=(start+end)/2;
		if(start>end)
		{
			return -1;
		}
		int mid=(start+end)/2;
		if(arr[mid]==x)
		{
			return mid;
		}
		if(arr[mid]<x)
		{
			return binary_search(arr,mid+1,end,x);
		}
		else
		{
			return binary_search(arr,start,mid-1,x);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {20,30,40,44,55};
		System.out.println(binary_search(arr,55));
	}

}
