package Array;

public class Check_Sorting {
	
	public static boolean sorting(int arr[])
	{
		for(int i =0 ;i<arr.length;i++)
		{
			if(arr.length<=1)
			{
				return true;
			}
		}
		
		int smallarr[]= new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			smallarr[i-1]=arr[i];
		}
		boolean smallans=sorting(smallarr);
		
		if(! smallans)
		{
			return false; 
		}
		if(arr[0]<=arr[1])
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,1,5};
		System.out.println(sorting(arr));
		
		
	}

}
