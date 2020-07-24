package Introduction_To_Recursion;

public class Remove_consecutive_charecter {
	
	public static String remove(String str)
	{
		char ch= str.charAt(0);
		String output=ch+"";
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)!=ch)
			{
				ch=str.charAt(i);
				output=output+ch+"";
			//ch=str.charAt(i);
			}
			
		}
		return output;
	}
	public static String remove1(String str)
	{
		return remove1(str,0);
	}
	
	public static String remove1(String str,int start)
	{
	//String output="";
		if(str.length()==1)
		{
			return str;
		}
		char ch =str.charAt(start);
		//String output1=remove1(str.substring(1));
		if(str.charAt(start+1)==ch)
		{
			return remove1(str.substring(start+1));
		}
           return str.charAt(start)+remove1(str.substring(start+1));
	
		
 	

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="aaabbhhhhhhhhcc";
System.out.println(remove1(str));
		
	}

}
