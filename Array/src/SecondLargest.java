import java.util.*;
public class SecondLargest {
public static int second_max(int arr[])
{
	int secondlargest=Integer.MIN_VALUE;
	int largest=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>largest)
		{
			secondlargest=largest;
			largest=arr[i];
			
		}
		if(arr[i]<largest && arr[i]!=largest && arr[i]>secondlargest)
		{
			secondlargest=arr[i];
		}
	}
	return secondlargest;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {3,4,5,2,8,8};
		int x= second_max(arr);
		System.out.println(x+" ");
		
		
	}

}
