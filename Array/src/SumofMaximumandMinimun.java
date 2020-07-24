import java.util.*;
public class SumofMaximumandMinimun {

	public static int Sum_max_min(int arr[])
	{
		int sum=0;
  int max=Integer.MIN_VALUE;
  int min=Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++)
  {
	  if(arr[i]>max)
	  {
		  max=arr[i];
		  
	  }
	  
	  if(arr[i]<min)
	  {
		  min=arr[i];
	  }
	  
  }
		sum=max+min;
		
		return sum;
	}
	
public static void main(String[] args)
{	
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]= new int[n];
	for(int i =0;i<arr.length;i++)
	{
		arr[i]= sc.nextInt();
	}
	
	
	
	int p=Sum_max_min(arr);
	System.out.println(p);
	
	
	
	
	}

}
