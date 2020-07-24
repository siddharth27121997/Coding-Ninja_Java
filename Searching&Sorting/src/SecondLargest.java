import java.util.*;
public class SecondLargest {

	public static int Second_largest(int []arr)
	
	{
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				second_largest=largest;
				largest=arr[i];
				
			}
			if(arr[i]<largest && arr[i]>second_largest && arr[i]!=largest)
			{
				second_largest=arr[i];
				
			}
			
		}
		return second_largest;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
int n= sc.nextInt();
int arr[]= new int[n];
for(int i=0;i<arr.length;i++)
{
	arr[i]=sc.nextInt();
}
int k=Second_largest(arr);
System.out.println(k);
		
		
		
	}

}
