package String;

public class Susequences_of_a_String {
	
	public static String[] findsubsequnces(String str)
	{
		return findsubsequnces(str,0);
	}

	private static String[] findsubsequnces(String str,int start)
	{
		if(start>=str.length())
		{
			String ans[]= {""};
			return ans;
			
		}
		String small_Ans[]= findsubsequnces(str.substring(start+1));
		
		String ans[]= new String[2*small_Ans.length];
		int k=0;
		for(int i=0;i<small_Ans.length;i++)
		{
			ans[k]=small_Ans[i];
			k++;
			
		}
		for(int i =0;i<small_Ans.length;i++)
		{
			ans[k]=str.charAt(0)+small_Ans[i];
			k++;
			//i++;
		}
		return ans;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "xyz";
String ans[]= findsubsequnces(str);
for(int i=0;i<ans.length;i++)
{
	System.out.println(ans[i]);
}
		
	}

}
