import java.util.*;
public class Max_minNottobeused {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
public static void wrong (int arr[])
{
	int sum=0;
	for(int i=0;i<1;i++)
	{
		int max=arr[i];
		int max_index=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
				max_index=j;
				
			}
			
			}
		if(i!=max_index)
		{
			arr[max_index]= arr[i];
			arr[i]= max;
			
		}
		
		//System.out.println(arr[i]+" ");
		sum=arr[i];
		
	}
	for(int i=0;i<1;i++)
	{
		int min=arr[i],min_index=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<min)
			{
				min=arr[j];
				min_index=j;
			}
			
			
		}
		if(i!=min_index)
		{
			arr[min_index]=arr[i];
			arr[i]=min;
		}
	
		//System.out.println("The min"+arr[i]);
	sum=sum+arr[i];
	System.out.println(sum);
	}
	}
	



	
	public static void main(String args[])
	{
	
int arr[]= {2,5,4,5};
wrong(arr);
	
		
	}
	
	
	
	}

