
public class Reverse_Each_Letter {

	public static String reverse_each(String str)
	{
		String output="";
		String reverse=""; 
		int start=0;
		int j;
		int end;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				end=i-1;
			
				for(j=end;j>=start;j--)
				{
					reverse+=str.charAt(j);
					
				}
			
				start=i+1;
			output+=reverse+" ";
		reverse="";
			}	
			
		}
		
		
		  for(j=str.length()-1;j>=start;j--)
		  {
			  reverse+=str.charAt(j);
	      }
		  output=output+reverse+" ";
		 return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome To Coding Ninja";

System.out.println(reverse_each(str));
		
	}

}
