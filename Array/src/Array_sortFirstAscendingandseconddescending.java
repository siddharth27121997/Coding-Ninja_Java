import java.util.*;
public class Array_sortFirstAscendingandseconddescending {

	public static void merge(int arr1[])
	{
		//int p=0;
		int arr3[]= new int [arr1.length];
		//int arr4[] = new int[arr1.length/2];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
			
	//System.out.println(arr3[i]);
		}
	
	
		for(int i=0;i<=arr3.length/2;i++)
		{
			int min=arr3[i];
			int min_index=i;
			for(int j=i+1;j<=arr3.length/2;j++)
			{
				if(arr3[j]<min)
				{
					min=arr3[j];
					min_index=j;
				}
			}
				if(i!=min_index)
				{
					//arr3[i]=min;
					arr3[min_index]=arr3[i];
				arr3[i]=min;
				}
		System.out.println(arr3[i]);
			}
	
	
	
		for(int i=((arr3.length/2)+1);i<arr3.length;i++)
	    {
			int max=arr3[i];
			int max_index=i;
			for(int j=i+1;j<arr3.length;j++)
			{
				if(arr3[j]>max)
				{
					max=arr3[j];
					max_index=j;
				}
			}
				if(i!=max_index)
				{
					//arr3[i]=min;
					arr3[max_index]=arr3[i];
				arr3[i]=max;
				}
		
		System.out.println(arr3[i]+" ");
		
		}
		
	}
	
			
	
	
	

	
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	int arr[]= new int[5];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]= sc.nextInt();
	}
	merge(arr);
	}
	

}
