import java.util.*;
public class BinarySearch {

	public static int binary_search(int arr[],int val) {
		int start;
		int end = arr.length-1;
		
		for(start=0;start<=end;)
		{
			int mid=(start+end)/2;
			if(arr[mid]==val)
			{
				
				return mid;
			
		}
			else if(arr[mid]<val)
			{
				start= mid+1;
			}
			else
			{
				end=mid-1;
			}
		
		
	}
return-1;

	}

public static int[] input()
{
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int arr[]= new int[n];
	for(int i =0;i<arr.length;i++)
	{
		arr[i]= sc.nextInt();
	}

return arr;
}


public static void main(String args[])
{
int arr[]= input();
Scanner sc = new Scanner(System.in);
int p =sc.nextInt();
int k=binary_search(arr,p);
System.out.println("The index is:"+k);
}
}





