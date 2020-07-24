


public class Sumof_max_secondmax {

	 public static long second(int arr[])
	{
		
		boolean flag=true;
		long sum=0;
		long sum1=0;
		long second_max= Long.MIN_VALUE;
		long max= Long.MIN_VALUE;
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				second_max=max;
				max=arr[i];
			}
			while(arr[i]>second_max && arr[i]<max && arr[i]!=max)
			{
				second_max=arr[i];
			}
		}
			sum=max+second_max;
			return sum;
	
		}
		
		
	
	


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,203,2};
		System.out.println(second(arr));
	}
		
		
	
		
		
		
		
	}


