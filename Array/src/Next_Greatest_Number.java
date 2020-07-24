
public class Next_Greatest_Number {
 public static void swap(int arr[])
 {
	 boolean div=true;
	 for(int i =0;i<arr.length-1;i++)
	 {
		 if(arr[i]>=arr[i+1])
		 {
			 div=false;
		 }
	 }
	 if(div==false)
	 {
		    for(int i=0;i<arr.length;i++)
		    {
		    	System.out.print(arr[i]+" ");
		    }
		 System.out.println();
		 
	 }
	 
	 
 }
 public static void swap1(int arr[])
 {
	 boolean div= true;
	 int end=arr.length-1;
	 int temp=arr[end-1];
	 for(int i=0;i<arr.length-1;i++)
	 {
		 
		 if(arr[i]>=arr[i+1])
		 {
			 div= false;
	        System.exit(0);		 
		 }
		 
	 }
	div=true;
	if(div==true)
	{
		arr[end-1]=arr[end];
		arr[end]=temp;
	}
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
 }
 
public static void selection(int arr[])
{
	int end=arr.length-1;
	for(int i=end;i>=1;i--)
	{
		int min=arr[i];
		int min_index=i;
		for(int j=i-1;j>=1;j--)
		{
			if(arr[j]<min)
			{
				min=arr[j];
		  		min_index=j;
			 break; 
			}
			
		}
	   if(i!=min_index)
	   {
		   arr[min_index]=arr[i];
		   arr[i]=min;
		   
		   break;
	   }
	}
	
	int arr2[]= new int [arr.length];
	for(int i=0;i<arr.length;i++)
	{
		arr2[i]=arr[i];
	}
	int store=0;
	for(int i=arr2.length-1;i>=1;i--)
	{
		
		if(arr2[i]>arr2[i-1])
		{
			store=i;
			break;
		}
		
	}
	
	for(int p=store;p<arr2.length;p++)
	{
		int min=arr2[p];
		int min_index=p;
		for(int j=p+1;j<arr2.length;j++)
		{
			if(arr2[j]<min)
			{
				min=arr2[j];
				min_index=j;
			}
		}
		if(p!=min_index)
		{
			arr2[min_index]=arr2[p];
			arr2[p]=min;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	for(int i=0;i<arr2.length-store;i++)
	{
		System.out.print(arr2[i]);
	}
for(int i = store;i<arr2.length;i++)
{
	System.out.print(arr2[i]);
}
System.out.println();
}



	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {4,3,2,1};
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,3,4,9,7,6};
		swap(arr);
		//System.out.println(x);
	swap1(arr1);
	
	selection(arr2);

	}
}
