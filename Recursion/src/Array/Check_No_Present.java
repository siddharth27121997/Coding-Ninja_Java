package Array;

public class Check_No_Present {

	public static boolean check(int arr[],int x)
	{
		if(arr.length==0)
		{
			return false;
		}
		if(arr[0]==x)
		{
			return true;
		}
		int arr2[]= new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			arr2[i-1]=arr[i];
		}
		boolean ans= check(arr2,x);
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,4,5};
		int x=7;
		System.out.println(check(arr,x));
	}

}
