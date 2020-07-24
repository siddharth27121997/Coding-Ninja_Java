
public class Check_array_is_Sorted {

	public static boolean sorted(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				return false;
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {2,3,4,5,1};
	System.out.println(sorted(arr));
	
	}

}
