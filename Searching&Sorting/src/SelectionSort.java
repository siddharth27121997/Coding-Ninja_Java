import java.util.*;
public class SelectionSort {

	public static void Selection_Sort(int arr[])
	{
		
		
		for(int i =0;i<arr.length;i++)
		{
			int min=arr[i];
			int min_index=i;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					min_index=j;
					
				}
				
			}
			if(i!=min_index)
			{
				arr[min_index]= arr[i];
				arr[i]=min;
				
			}
		
			System.out.print(arr[i]+" ");	
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
         int n = sc.nextInt();
         int arr[]= new int[n];
         for(int i =0;i<arr.length;i++)
         {
        	 arr[i]= sc.nextInt();
        	 
        	 
        	 
         }
         
         Selection_Sort(arr);
        	 
	
	
	}
	
	
	
	
}


