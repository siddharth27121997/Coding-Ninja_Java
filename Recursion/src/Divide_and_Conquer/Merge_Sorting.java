package Divide_and_Conquer;

public class Merge_Sorting {

	public static void  merge_sort(int arr[])
	{
		merge_sort(arr,0,arr.length-1);
	}
	public static void merge_sort(int arr[],int start,int end)
	{
		if(start>=end)
		{
			return ;
			
		}
		int mid=(start+end)/2;
		merge_sort(arr,start,mid);
		merge_sort(arr,mid+1,end);
		merge(arr,start,end);
	}
	public static void merge(int arr[],int start, int end)
	{
		int mid=(start+end)/2;
		int arr1[]= new int[end-start+1];
		int k=0;
		int i=start;
		int j =mid+1;
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
		for(int p= 0;p<arr1.length;p++)
		{
			arr[start+p]=arr1[p];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,1,3,44,99,3};
		merge_sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
