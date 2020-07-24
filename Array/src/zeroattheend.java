import java.util.*;
public class zeroattheend {
public static void zeroat_end(int arr[])
{
	
	int k[]= new int[arr.length];
	int count=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]!=0)
		{
		k[count]=arr[i];
		count++;
		
	}
		k[count]=0;
}
	for(int i=0;i<k.length;i++)
	{
	System.out.print(k[i]+" ");

	}
System.out.println();
}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,0,1,0};
		zeroat_end(arr);
/*	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	}
	}
*/
	}
}
