package Divide_and_Conquer;

public class QuickSort_ {
	
	public static void quick_sort(int arr[])
	{
		
	int end = arr.length-1;
	quick_sort(arr,0,arr.length-1);
		
	}
	public static void quick_sort(int arr[],int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int pivot_pos=partition(arr,start, end);
		quick_sort(arr,start,pivot_pos-1);
		quick_sort(arr,pivot_pos+1,end);
		
	}
	
public static int partition(int arr[],int start, int end)
{
	int pivot=arr[start];
	int count=0;
	for(int i=start+1;i<=end;i++)
	{
		if(arr[i]<=pivot)
		{
		count++;
	}
	}
	int pivot_pos=start+count;
	arr[start]=arr[pivot_pos];
	arr[pivot_pos]=pivot;
	int i=start;
	int j=end;
	while(i<=pivot_pos && j>pivot_pos)
	{
		if(arr[i]<=pivot)
		{
			i++;
			
		}
		else if (arr[j]>pivot)
		{
			j--;
		}
		else
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}
	return pivot_pos;
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,42,41,133};
		quick_sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
System.out.println();
	}

}
