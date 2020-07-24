
public class Reverse_wordsof_String {

	
	public static String reverse_words(String str)
	{
		String rev="";
	   int i=str.length()-1;
	   int end=str.length();
	   while(i>=0)
	   {
		if(str.charAt(i)==' ')
		{
			
			rev=rev+str.substring(i+1,end)+" ";
		end=i;
		}
		
		i--;
		   
		   
		   
	   }
	   
	   
	   rev=rev+str.substring(0,end);
		return rev;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Welcome to world of coding!";
	System.out.println(reverse_words(str));
	
	}

}
