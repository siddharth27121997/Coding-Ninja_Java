
public class MinimumandSecondMinimum_Sum {

	public static int minimum(int arr[])
	{
		int max=Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int second_min=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				second_min=min;
				min=arr[i];
				
			}
			
			if(arr[i]<second_min && arr[i]>min && arr[i]!=min)
			{
				second_min=arr[i];
			}
			if(arr[i]>max)
			{
				second_max=max;
				max=arr[i];
			}
			if(arr[i]>second_max && arr[i]<max && arr[i]!=max)
			{
				second_max=arr[i];
			}
			
			
		}
		sum=second_min+max;
		return sum;
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,1,2,4};
		int x=minimum(arr);
	System.out.println(x);
	}

}
