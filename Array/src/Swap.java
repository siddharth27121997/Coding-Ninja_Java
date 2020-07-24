import java.util.Scanner;

public class Swap {
public static void swapAlternate(int arr[]) {
        
        /* Your class should be named Solution.
        * Don't write main().
        * Don't read input, it is passed as function argument.
        * Taking input and printing output is handled automatically.
        */      
        int size = arr.length;
        int swap,k;
        //int size = arr.length;
        //int arr[]= new int[size];
        for(int i=0;i<size-1;i=i+2)
        {
            
            {
                swap=arr[i];
                k=arr[i+1];
                arr[i+1]=swap;
              //  System.out.print(arr[i+1]);
                arr[i]=k;
               // System.out.print(arr[i]);
               // System.out.print(arr[i]+" ");
            }  
            
            
        }

        
    }
public static int[] takeInput()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array:");
int size = sc.nextInt();
int arr[]= new int[size];
for(int i =0;i<size;i++)
{
	arr[i]= sc.nextInt();
	
}
return arr;
	
}
	
public static void print(int arr[])
{
	//int size= arr.length;
	for(int i =0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	

    
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= takeInput();
		//System.out.println(arr);
print(arr);
swapAlternate(arr);
print(arr);
	
	
	
	}

}
