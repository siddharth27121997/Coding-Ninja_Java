
public class Compress_String_ {

	public static String compress(String str)
	{
		String output="";
		char ch = str.charAt(0);
		output+=ch;
		int count=1;
		for(int i=1;i<str.length();i++)
		{
			
			if(str.charAt(i)==ch)
			{
				count++;
			}
			if(str.charAt(i)!=ch)
			{
			if(count>1)
			{
				output=output+count+str.charAt(i);
			}
			else
			{
				output+=output+str.charAt(i);
			}
			count=1;
			ch=str.charAt(i);
			}
		}
		if(count>1)
		{
			output=output+count;
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String output="bbcccddd";
System.out.println(compress(output));
		
	}

}
