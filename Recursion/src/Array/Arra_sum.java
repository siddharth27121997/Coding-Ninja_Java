package Array;

public class Arra_sum {

private static int sum(int arr[],int start_index)
{
		if(start_index==arr.length)
		{
			return 0;
		}
		
		int ans= sum(arr,start_index+1);
		return ans+arr[start_index];
		
	}
	public static int sum(int arr[])
	{
		return sum(arr,0);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,6};
		System.out.println(sum(arr));
		
	}

}
