import java.util.*;
public class Insertionsort {
public static void insertion_sort(int arr[])
{
	for(int i=1;i<arr.length;i++)
	{
		int j=i-1;
		int temp=arr[i];
		while(j>=0 && arr[j]>temp)
		{
			
			arr[j+1]=arr[j];
			arr[j]=temp;
			j--;
			
			
		}
	
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		int arr[]= {9,3,6,2,0};
		
		
		
		insertion_sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");	
		}
		System.out.println();
		
		
		
		
		
		
		
		
	}

}
