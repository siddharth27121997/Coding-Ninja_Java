import java.util.*;
public class BinarySearch2 {

	public static int Binary_Search(int arr[],int val)
	{
         int start;
         int end=arr.length-1;
         for(start=0;start<=end;)
         {
        	 int mid=(start+end)/2;
        	 
        	 if(arr[mid]==val)
        	 {
        		 return mid;
        		 
        	 }
        	 
        	 else if(arr[mid]<val)
        	 {
        		 start=mid+1;
        		 
        	 }
        	 else
        	 {
        		 end=mid-1;
        		 
        	 }
         }

         
      return-1;
	}

public static int[] input()
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int arr[] = new int[n];
for(int i =0;i<arr.length;i++)
	
{
	
	arr[i]=sc.nextInt();
	
}
return arr;
	
}


public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);

	//int p=sc.nextInt();
	int arr[]=input();
	System.out.println("Enter the val to be searched:");
	int p=sc.nextInt();
	int k= Binary_Search(arr,p);
	System.out.println("The position is:"+k);
	//System.out.println(arr);
	
}





}