import java.util.*;
public class Zig_ZagArray {

	public static void zig_zag(int arr[])
	{
	//int temp=0;
//int i=0;
	boolean flag=true;
	for(int i=0;i<arr.length-1;i++)
	{
		int temp=0;
		if(flag==true)
		{
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
//			i++;
			//flag=!flag;
		 }
			
			
			
		}
		
		else if(flag==false)
		{
	
			if(arr[i+1]>arr[i])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			//	flag=!flag;
			
			}
		}
			
			
				flag=!flag;
				//i++;
			
			
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6};
		zig_zag(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
