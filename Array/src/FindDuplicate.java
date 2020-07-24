import java.util.*;
public class FindDuplicate {

	public static int duplicate(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if (i!=j)
				{
					if(arr[i]==arr[j])
					{
						
					
					return arr[i];
				}
				}
			}
		}
		
		return -1;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,1,7,4,7,3};
		
		int k=duplicate(arr);
		System.out.println(k);
		
		
	}

}
