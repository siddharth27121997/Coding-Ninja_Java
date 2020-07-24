
public class Remove_the_charecter_from_String {

	public static String function(String str, char c)
	{
		String output="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=c)
			{
				output+=str.charAt(i);
			}
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcomo To Coding Ninja";
		char ch='o';
		System.out.println(function(str,ch));
	}

}
