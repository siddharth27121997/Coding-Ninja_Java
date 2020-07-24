package String;

public class Compress_a_Sring {

	public static String function(String str)
	{
		
		return function(str,0);
	}


	public static String function(String str,int start)
	{
		
		
		if(start>=str.length()-1)
		{
//			output=output+str.charAt(str.length()-1);
			return str;
		}
		String output= str.charAt(start)+""; 
	
		if(str.charAt(start+1)==str.charAt(start))
		{
		
			 return function(str.substring(start+1));
		}
		return output+function(str.substring(start+1));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="aaabbss";
	System.out.println(function(str));
	
	}

}
