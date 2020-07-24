package Divide_and_Conquer;

public class Merge_Sort_Again {

	public static void merge(int arr[])
	{
		int end= arr.length-1;
		merge(arr,0,end);
	}
	public static void merge(int arr[], int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int mid=(start+end)/2;
		merge(arr,start,mid);
		merge(arr,mid+1,end);
		merge_sort(arr,start,end);
	}
	public static void merge_sort(int arr[],int start,int end)
	{
		int mid=(start+end)/2;
		int i=start;
		int j=mid+1;
		int arr1[]= new int[end-start+1];
		int k=0;
		while(i<=mid && j<=end)
		{
			if(arr[i]<arr[j])
			{
				arr1[k]=arr[i];
				k++;
				i++;
			}
			else
			{
				arr1[k]=arr[j];
				j++;
				k++;
			
					
			}
		}
		while(i<=mid)
		{
			arr1[k]=arr[i];
			k++;
			i++;
		}
		while(j<=end)
		{
			arr1[k]=arr[j];
			k++;
			j++;
			
		}
		for(int p=0;p<arr1.length;p++)
		{
			arr[p+start]=arr1[p];
		}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {4,1,21,34};
	merge(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}

}
