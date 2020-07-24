import java.util.*;
public class ShiftZero_TotheEnd {

	public static void shift_zero(int arr[])
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
			
		}
		for(int i=0;i<k.length;i++)
		{
			arr[i]=k[i];
		//	System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
		
		
		
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {3,0,1,1,0,12,32,0,3,3};
shift_zero(arr);
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
	System.out.println();
	
	}

}
