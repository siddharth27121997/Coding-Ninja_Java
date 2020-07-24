import java.util.*;
public class Largestarray {

	
	public static int largestinArray(int arr[])
	{
		
		int max = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		return max;
	}
	
	
	
	
	
	
	
	public static int lowestinArray(int arr[])
	{
		
		int min = Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			
		}
		return min;
	}
	
	public static int[] inputarray()
	{
		Scanner sc = new Scanner(System.in);
		
int size= sc.nextInt();
int arr[] = new int[size];
for(int i =0;i<size;i++)
{
arr[i]= sc.nextInt();
	
	
}

	return arr;
	}
	public static void print(int arr[])
	{
		int size = arr.length;
		
		for(int i =0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
			
			
		}
		System.out.println();
		
	}
	public static void main(String[] args)
	{
		
	int arr[]= inputarray();
	print(arr);
//	int max= largestinArray(arr);
	System.out.println("Largest "+largestinArray(arr));
	System.out.println("Lowest "+lowestinArray(arr));	
		
	
	}
	
}