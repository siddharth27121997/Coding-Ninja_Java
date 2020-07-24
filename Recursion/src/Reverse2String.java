
public class Reverse2String {

	public static String reverse_string(String str)
	{
		if(str.length()==0)
		{
			return str;
		}
		String output=str.charAt(str.length()-1)+"";
		//reverse_string(str.substring(0,str.length()-1));
	return output+reverse_string(str.substring(0,str.length()-1));	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String output="abcd efgh";

System.out.println(reverse_string(output));
	}

}
