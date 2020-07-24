import java.util.*;
public class Singleoddnumber {

	
	
	public static void  odd(int arr[])
	{
		String output="";
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>=0 && arr[i]<=10)
			{
				if(arr[i]%2!=0)
				{
					output=output.concat(String.valueOf(arr[i]));
					
				}
			}
			
		}
		 if(output.equals(""))
	            System.out.println("Single digit odd number is not found in the array");
	        
	        else
	            System.out.println(output);
	        }
	
	
	
	

	
	
	

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int n =sc.nextInt();
		
		
	if(n>0)
	{
		
	
		
		int arr[]= new int[n];
		for(int i =0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
				
	odd(arr);
	}
	
		
		
	}

}
