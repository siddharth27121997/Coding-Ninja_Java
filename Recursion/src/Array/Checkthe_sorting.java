package Array;

public class Checkthe_sorting {
	
	public static boolean check(int arr[])
	{
		
		return check(arr,0);
	}
	public static boolean check(int arr[],int start)
	{
		if(start>=arr.length-1)
		{
			return true;
		}
		if(arr[start]>arr[start+1])
		{
			return false;
		}
		
		boolean ans = check(arr, start+1);
		if(!ans)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,32,222};
		System.out.println(check(arr));
	}

}
