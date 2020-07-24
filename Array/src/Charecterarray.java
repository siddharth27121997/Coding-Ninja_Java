import java.util.*;
public class Charecterarray {

	public static void concat(char arr1[],char arr2[])
	{
		char k[]= new char[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			k[i]=arr1[i];
			
		}
		for(int i=0;i<arr2.length;i++)
		{
			k[arr1.length+i]=arr2[i];
		}
		for(int i =0;i<k.length;i++)
		{
			System.out.print((char)(k[i])+"");
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the no. of charecters in first charecter array");
    int n = sc.nextInt();
    System.out.println("Enter the no. of charecters in second charecter array");
    int n1=sc.nextInt();
    char arr1[]= new char[n];
    for(int i=0;i<arr1.length;i++)
    {
    	arr1[i]=sc.next().charAt(0);
    }
    
	 //char ch1= sc.next().charAt(0);
	char arr2[]= new char [n1];
	for(int i=0;i<arr2.length;i++)
	{
		arr2[i]= sc.next().charAt(0);
	}
	System.out.println("Total concat:");
	concat(arr1,arr2);
	}

}
