
public class replace_c1_c2 {

	public static String function(String str,char c1, char c2)
	{
		return function(str,c1,c2,0);
	}
	private static String function(String str, char c1, char c2,int start)
	{
		if(start>=str.length())
		{
		return str;	
		}
		String output="";
		if(str.charAt(start)==c1)
		{
			output+=c2+"";
			//return function(str.substring(start+1),c1,c2);
		}
		if(str.charAt(start)!=c1)
		{
			output+=str.charAt(start)+"";
		}
		return output+function(str.substring(start+1),c1,c2);
}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String output="abcss";
       System.out.println(function(output,'s','x'));
		
	}

}
