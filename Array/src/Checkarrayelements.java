import java.util.*;
public class Checkarrayelements {
public static boolean check(int arr1[],int arr2[])
{
	for(int i=0;i<arr1.length;i++)
	{
		if(arr1[i]!=arr2[i])
		{
			return false;
		}
	}
	return true;
	
}
		
		
	
	

	
	public static void main(String args[])
	{
     
		int arr1[]= {3,4,5,6,9};
		int arr2[]= {3,4,5,6,8};
System.out.println(check(arr1,arr2));
System.exit(0);
		
	}
}