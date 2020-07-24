import java.util.*;
public class Array__Intersection {

	public static void method(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		
		{
			int j;
			for( j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j])
					{
						break;
					}
				}
		
		}
			if(j==arr.length)
			{
				System.out.println(arr[i]);
			}
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,4,5,4,3};
		
		method(arr);
	}

}
