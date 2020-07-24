import java.util.*;
public class Rotation_Array {

	public static int[] rotate_array(int arr[],int d)
	{
//		  public static void rotate(int[] arr, int d) {
		    	//Your code goes here
		        
		        
		        
		        	
			
				//int start=0;
				int end=arr.length-1;
				//int p=end-d;
			//	int k=0;
				//int temp;
		        
		        
				
				for(int i=0;i<=end;i++)
				{
					int temp=arr[i];
				arr[i]=arr[end];
				arr[end]=temp;
				//start++;
				end--;	
				}
				
				int arr1[]=new int[arr.length];
				
					for(int i=0;i<arr1.length;i++)
					{
						arr1[i]=arr[i];
					}
					//int last=arr1.length-1;
					int clone=((arr1.length-1)-d);
					int p=clone+1;
					for(int i=0;i<=clone;i++)
					{
						
						int temp=arr1[i];
						arr1[i]=arr1[clone];
						arr1[clone]=temp;
						clone--;
				    }
				
					int start= arr1.length-d;
					int last=arr1.length-1;
		             while(start<arr1.length)
		             {
		            	 int temp=arr[start];
		            	 arr1[start]=arr[last];
		            	 arr1[last]=temp;
		            	 start++;
		            	 last--;
		             }
				
					
					
					
					
					
				
			return arr1;

		        
		    } 
	
	
	public static int[] array_rotation(int arr[],int d)
	{
		int arr2[]= new int[arr.length];
		int arr3[]= new int[d];
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=arr[i];
		}
		/*
		 * int end=arr3.length-1; //int i; for(int i=0;i<=end;i++) { int temp=arr3[i];
		 * arr3[i]=arr3[end]; arr3[end]=temp; }
		 */	
		for(int  i=0;i<arr2.length-d;i++)
		{
			
			arr2[i]=arr[i+d];
		//count++;
		}
		int count=0;
		for(int i=arr2.length-d;i<arr2.length;i++)
		{
			arr2[i]=arr3[count];
			count++;
		}

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=arr2[i];
		}
		
		return arr;
		
	}
	
	
	
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			/*
			 * int n=sc.nextInt(); int arr[]= new int[n]; for(int i=0;i<arr.length;i++) {
			 * arr[i]=sc.nextInt(); } int d= sc.nextInt();
			 * 
			 * int arr1[]=rotate_array(arr,d); for(int i =0;i<arr1.length;i++) {
			 * System.out.print(arr1[i]+" "); } System.out.println();
			 */
		int k[]= {1,2,3,4,5,6,7};
		int arr1[]= array_rotation( k,5);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
	System.out.println();
} 
}
		        
		        
		        
		        
		    
