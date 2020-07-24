import java.util.*;
public class First_Letter_Capital {

	public static void string_first(String str)
	{
//		int size=arr.length;
		char arr[]= str.toCharArray();
int size=arr.length;
		arr[0]=(char)(arr[0]-32);
for(int i=1;i<size;i++)
{
	//System.out.println(arr[i]);
	if(arr[i]==' ')
	{
		 arr[i+1]=(char)(arr[i+1]-32);
	}
	
	
		
	
	
	
}


	System.out.print(arr);




	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome To coding";
		string_first(str);
		
		
	}

}
