package Divide_and_Conquer;

public class Quick_Sort_Again {

	public static void quick_sort(int arr[])
	{
		int end= arr.length-1;
		quick_sort(arr,0,end);
	}
	public static void quick_sort(int arr[],int start,int end)
	{
		if(start>=end)
		{
			return ;
		}
		int pivot_pos= partition(arr,start,end);
		quick_sort(arr,start,pivot_pos-1);
		quick_sort(arr,pivot_pos+1,end);
	}
	public static int partition(int arr[],int start,int end)
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
		int temp=arr[pivot_pos];
		arr[pivot_pos]=pivot;
		arr[start]=temp;
	
	int i=start;
	int j=end;
	while(i<=pivot_pos && j>pivot_pos)
	{
		if(arr[i]<=pivot)
		{
			i++;
		}
		else if(arr[j]>pivot)
		{
			j--;
		}
		else
		{
	int temp2=arr[i];
	arr[i]=arr[j];
	arr[j]=temp2;
	i++;
	j--;
	}
	}
	return pivot_pos;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {3,1,3,4,5,2};
	quick_sort(arr);
	
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	
	System.out.println();
	}

}
