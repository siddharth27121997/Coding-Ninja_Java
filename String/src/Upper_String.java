
public class Upper_String {

	public static String function(String str)
	{

		
		
		return function(str,0);  
			
		}
		public static String function(String str, int start)
		{
		
			if(str.length()==0)
			{
			return "";	
			}
			if(str.charAt(start)=='x')
			{
				return function(str.substring(start+1));
			}
			else
			{
				return str.charAt(start)+function(str.substring(start+1));
			}
			
			
			
		}
		
		public static String removeX(String str)
		{
		String output="";
			if(str.length()==0)
			{
				return "";
			}
			if(str.charAt(0)!='x')
			{
				
				output=output+str.charAt(0);
				
			}
			String ans=removeX(str.substring(1));
			return output+ans;
		}
		
		public static int sum(int n)
		{
			
			
			return sum(n,0);
		}
	public static int sum(int n,int sum)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			sum+=n%10;
		return sum(n/10)+sum;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="xssxxcd";
System.out.println(function(str));
System.out.println(removeX(str));
int n= 345;
System.out.println(sum(n));
		
	}

}
