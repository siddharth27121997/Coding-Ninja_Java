
public class replacec1toc2 {

	public static String replace(String str, char c1, char c2)
	{
		return replace(str, c1, c2,0);
	}
	public static String output="";
	public static String replace(String str, char c1, char c2, int start)
	{
		if(start>=str.length())
		{
			return str;
		}
		
		if(str.charAt(start)==c1)
		{
			output+=c2+"";
		 replace(str.substring(start+1),c1,c2);	
		}
		if(str.charAt(start)!=c1)
		{
			output+=str.charAt(start)+"";
		    replace(str.substring(start+1),c1,c2);
		}
		return output;
		
					
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcda";
	System.out.println(replace(str,'a','x'));
	
	}

}
