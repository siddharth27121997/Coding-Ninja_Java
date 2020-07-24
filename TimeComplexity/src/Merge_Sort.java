
public class Merge_Sort {
	
	
	public static void merge_sort(int arr[])
	{
		int end = arr.length-1;
		merge_sort(arr,0,end);
	}
	
	public static void merge_sort(int arr[], int start, int end)
	{
		if(start>=end)
		{
			return;
		}
		int mid=(start+end)/2;
		
		merge_sort(arr,start,mid);
		merge_sort(arr,mid+1,end);
		merge(arr,start,end);
	}
	public static void merge(int arr[],int start, int end)
	{
		int mid=(start+end)/2;
		int i=start;
		int j=mid+1;
		int k=0;
		int arr1[]= new int[end-start+1];
		while(i<=mid && j<=end)
		{
			if(arr[i]<=arr[ j])
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
	arr[index+start]=arr1[index];
	
	}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(long n=10;n<=100000000;n*=10)
{
	int arr[]= new int [(int)n];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=arr.length-1;
	}
	long startTime= System.currentTimeMillis();
	merge_sort(arr);
	long endTime=System.currentTimeMillis();
	System.out.println("Time for merge sort  " +n+ "  is " +(endTime-startTime));
	
	
}
	}

}


