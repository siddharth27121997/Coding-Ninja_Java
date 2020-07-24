
public class Zig_Zag_Array {

	public static void zigger(int arr[])
	{
		boolean div = true;
		for(int i=0;i<arr.length-1;i++)
		{
			int temp=0;
			if(div==true)
			{
				if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				
			}
			else if (div == false)
			{
				if(arr[i+1]>arr[i])
				{
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
			}
			div=!div;
			
		}
	}
	public static void main(String args[])
	{
		int arr[]= {123343,4442,44344,5737,44334,3343};
		zigger(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
}
