import java.util.*;
public class Printallcharecter {
public static void print(String s)
{
	for(int i=s.length()-1;i>=0;i--)
	{
		System.out.print(s.charAt(i)+"");
		
	}
	System.out.println();
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="my";
		print(str);
	}

}
