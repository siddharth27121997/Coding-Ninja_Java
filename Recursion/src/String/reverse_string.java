package String;

public class reverse_string {

	
	public static String reverse(String str )
	{
		String output="";
	if(str.length()==0)
	{
		output='z'+output+"";
		return str;
		
	}
	output= str.charAt(str.length()-1)+"";
		
	return output+reverse(str.substring(0,str.length()-1));
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="apple monk";
System.out.println(reverse(str));
	}

}
