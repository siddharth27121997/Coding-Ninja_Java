package String;

public class Subsequences {

public static String[] subsequences(String str)
{
	return subsequences(str,0);
	
	
}

private static String [] subsequences(String str, int start)
{
	if(start>=str.length())
	{
		String ans[]= {""};
		return ans;
	}
	
	String smallAns[]= subsequences(str.substring(start+1));
	String Ans[]= new String[2*smallAns.length];
	int k=0;
	for(int i=0;i<smallAns.length;i++)
	{
		Ans[k]= smallAns[i];
	
	k++;
	}
		for(int i=0;i<smallAns.length;i++)
		{
			Ans[k]= str.charAt(0)+smallAns[i];
			k++;
		}
			
	return Ans;
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="xyz";
String ans[]=subsequences(str);
for(int i=0;i<ans.length;i++)
{
	System.out.println(ans[i]);
}
		
	}

}
