package Introduction_To_Recursion;

public class Sum_Of_Array {
public static int sum(int arr[])
{
	if(arr.length==0)
	{
		return 0;
	}
	int arr1[]= new int [arr.length-1];
	for(int i=0;i<arr.length-1;i++)
	{
		arr1[i]=arr[i+1];
	}
	int soul=sum(arr1);

	return arr[0]+soul;
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,5};
		System.out.println(sum(arr));
		
	}

}
