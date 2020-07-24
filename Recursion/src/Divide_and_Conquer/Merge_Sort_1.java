package Divide_and_Conquer;

public class Merge_Sort_1 {
	
	  public static void merge_sort(int arr[]) {
	  
	  int end=arr.length-1; 
	  merge_sort(arr,0,end);
	  
	  }
	  
	  private static void merge_sort(int arr[],int start, int end )
	  {
      if(start>=end)		  
      {
    	  return;
      }
      int mid=(start+end)/2;
      merge_sort(arr,start,mid);
      merge_sort(arr,mid+1,end);
      
      merge(arr,start,end);
	  }
	private static void merge(int arr[],int start, int end)
	{
		int mid=(start+end)/2;
		int i=start;
		int j=mid+1;
		int arr1[]= new int[end-start+1];
		int k=0;
		while(i<=mid && j<=end)
		{
		if(arr[i]<arr[j])	
		{
			arr1[k]= arr[i];
			k++;
			i++;
		}
		else
		{
			arr1[k]= arr[j];
			k++;
			j++;
		}
		}
		while(i<=mid)
		{
		arr1[k]=arr[i];
		i++;
		k++;
	    }
	 while(j<=end)
	 {
		 arr1[k]=arr[j];
		 j++;
		 k++;
	 }
	 for(int index= 0;index<arr1.length;index++)
	 {
		 arr[start+index]=arr1[index];
		 
	 }
       


}
	  
	  public static void main(String args[])
	  {
		int arr[]= {1,3,2,5,8,4};  
      merge_sort(arr);
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.print(arr[i]+" ");
      }
	  System.out.println();
	  }
	  }
