import java.util.*;
public class Unique {

	
	public static int unique(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			
			sum=sum^arr[i];
			
		}
		return sum;
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {8,4,4,4,4};
int x= unique(arr);
System.out.println(x);
	}

}
