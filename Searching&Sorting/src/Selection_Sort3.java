import java.util.*;
public class Selection_Sort3 {

	
	public static int[] selection_sort(int arr[])
	{
		for(int i =0;i<arr.length;i++)
		{
			int temp=arr[i];
	      int min=arr[i];
	      int min_index=i;
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
				/*
				 * arr[i]=min; arr[min_index]=arr[i];
				 *///arr[min_index]=arr[i];
	    	  arr[i]=min;
	    	  arr[min_index]=temp;
	    	  
	      }
			
			
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int arr[]= {2,11,8,3,77};
	int k[]=selection_sort(arr);
	for(int i=0;i<k.length;i++)
	{
		System.out.print(k[i]+" ");
	}
	System.out.println();
	
	}

}
