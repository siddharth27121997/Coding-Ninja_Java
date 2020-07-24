package String;

public class reversethenappend {

	public static String output="";
	public static String temp="";
	public static String reverse_append(String str,char ch)

	{
		
		if(str.length()==0)
		{
			output=ch+output;
			return str;
		}
     output=output+str.charAt(str.length()-1)+"";		
		reverse_append(str.substring(0, str.length()-1),ch);
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generatedmethod stub
String str="apple monk";
		System.out.println(reverse_append(str,'a'));
	}

}
