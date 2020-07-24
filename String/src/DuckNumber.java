import java.util.*;

public class DuckNumber {

	public static boolean duck_num(String num)
	{
		int i=0;
		int n= num.length();
		while(i<n && num.charAt(i)=='0')
		{
		i++;
		}	//i++;
		while(i<n)
		{
			if(num.charAt(i)=='0')
			{
				return true;
			}
			i++;
		}
			return false;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String num="0005333";		
		System.out.println(duck_num(num));
		
		System.out.println(num.substring(3,4));
		
	}
	

}
