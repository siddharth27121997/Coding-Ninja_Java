package Divide_and_Conquer;

public class Merge_Sort4 {
	
	public static void mergeSort(int arr[])
	{
		int end=arr.length-1;
		mergeSort(arr,0,end);
	}
	public static void mergeSort(int arr[],int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int mid=(start+end)/2;
		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,end);
	}
	public static void merge(int arr[],int start,int end)
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
				i++;
				k++;
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
				i++;
				k++;
			}
			while(j<=end)
			{
				arr1[k]=arr[j];
				j++;
				k++;
			}
			
		
		for(int index=0;index<arr1.length;index++)
		{
			arr[start+index]=arr1[index];
			
			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {44,33,22,11};
mergeSort(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
System.out.println();
	}

}
