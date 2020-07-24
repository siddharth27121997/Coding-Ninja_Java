package Array;

public class Sum {

	public static int sum(int arr[])
	{
		
		return sum(arr,0);
	}
	public static int sum(int arr[],int start)
	{
		int sum1=0;
		if(start>=arr.length)
		{
			return 0;
		}
		sum1+=arr[start];
		
		int a=sum(arr,start+1);
		return sum1+a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,4,44,44};
		System.out.println(sum(arr));
	}

}
