import java.util.*;
public class Bubble_Sort {
	
	public static void BubbleSort(int arr[])
	{
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				int p=arr[j];
				int k=arr[j+1];
			
			if(arr[j]>arr[j+1])
			{
				arr[j]=arr[j+1];
				arr[j+1]=p;
				
			}
			
			
			}
		}
			
			
		}
	
	


	public static void main(String[] args) {
		int arr[] = {2,4,21,22,12};
		BubbleSort(arr);
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	System.out.println();

}
}