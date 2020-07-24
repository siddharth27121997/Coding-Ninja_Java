import java.util.*;
public class Permutation_ofString {

	public static void permutation(String str1,String str2)
	{
		//boolean div = true;
		char arr1[]=str1.toCharArray();
		char arr2[]= str2.toCharArray();
		if(arr1.length!=arr2.length)
		{
			System.out.println("No");
		System.exit(0);
		}
		else
		{
			for(int i=1;i<arr1.length;i++)
			{
				char temp=arr1[i];
				int j=i-1;
				while(j>=0 && arr1[j]>temp)
				{
					arr1[j+1]=arr1[j];
					arr1[j]=temp;
					j--;
				}
				
				
			}
			for(int i=1;i<arr2.length;i++)
			{
				char temp=arr2[i];
				int j=i-1;
				while(j>=0 && arr2[j]>temp)
				{
					arr2[j+1]=arr2[j];
					arr2[j]=temp;
					j--;
				}
				
				
			}
			
			
			
			for(int i=0;i<arr1.length;i++)
				
			{
				if(arr1[i]!=arr2[i])
				{
					System.out.println("no");
				System.exit(0);
				}
			}
			System.out.println(str1 + " " + str2+" "+ "Both are permutate");
		}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String str1=sc.next();
String str2=sc.next();
		
permutation(str1,str2);
	}

}
