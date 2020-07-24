package Divide_and_Conquer;

public class Merge_Sort {

	public static void mergeSort(int arr[]){
		// Write your code here
		int end= arr.length-1;
        mergeSort(arr,0,arr.length-1);
        
        
	}
    public static void mergeSort(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid=(start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,end);
    
    
    
    }
    
    public static void merge(int arr[], int start, int end)
    {
        int mid=(start+end)/2;
        
        int arr1[]= new int[end-start+1];
        
        int i=start;
        int j=mid+1;
    int k=0;
        while(i<=mid && j<=end)
        {
            if(arr[i]<=arr[j])
            {
            arr1[k]=arr[i];
                k++;
                i++;
                
            }
            else
            {
                arr1[k]=arr[j];
                k++;
                j++;
            }
            
            
        }
        while(i<=mid)
        {
         arr1[k]=arr[i];
            i++;
            
        }
        while(j<=end)
        {
            arr1[k]=arr[j];
            j++;
            k++;
        }
        for(int p=0;p<arr1.length;p++)
        {
            
            arr[start+p]=arr1[p];
        }
        
    }
    public static void main(String args[])
    {
    	int arr[]= {8,7,5,4,3};
    	mergeSort(arr);
    	for(int i =0;i<arr.length;i++)
    	{
    		System.out.print(arr[i]+" ");
    	}
    	
    	System.out.println();
    }
    
}
