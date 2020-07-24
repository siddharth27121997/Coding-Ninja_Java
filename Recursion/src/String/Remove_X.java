package String;

public class Remove_X {
public static String remove_X(String str)
{
	return remove_X(str,0);
}
public static String remove_X(String str,int start)
{
if(start>=str.length())
{
return str;	
}
String output="";
if(str.charAt(start)=='x')
{
	return remove_X(str.substring(start+1));
}
	output=str.charAt(start)+"";
	return output+remove_X(str.substring(start+1));

}
		
		

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abxbxxbxxxsds";
		System.out.println(remove_X(str));
	}

}
