import java.util.*;
public class Prefix {
public static void prefix(String str)
{
	for(int i=0;i<str.length();i++)
	{
		System.out.println(str.substring(0,i+1));
		
	}
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcde";
		prefix(str);

	}

}
