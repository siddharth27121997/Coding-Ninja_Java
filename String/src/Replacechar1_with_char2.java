
public class Replacechar1_with_char2 {

	
	public static String replace(String str,char c1,char c2)
	{
		
		if(str.length()==0)
		{
			return "";
		}
		char ch;
		if(str.charAt(0)==c1)
		{
			ch=c2;
		}
		else
		{
			ch=str.charAt(0);
		}
		String output=replace(str.substring(1),c1,c2);
		return ch+output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abcxdx";
System.out.println(replace(str,'x','v'));
}

}
