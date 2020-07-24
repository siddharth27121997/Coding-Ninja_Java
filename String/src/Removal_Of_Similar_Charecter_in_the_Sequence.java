import java.util.*;
public class Removal_Of_Similar_Charecter_in_the_Sequence {
public static String removal(String str)
{
	char ch=str.charAt(0);
	String output=ch+"";
	for(int i=1;i<str.length();i++)
	{
		if(str.charAt(i)!=ch)
		{
			ch=str.charAt(i);
			output=output+ch;
		}
	}
	return output;
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String str="aaabbcca";
  System.out.println(removal(str));
		
	}

}
