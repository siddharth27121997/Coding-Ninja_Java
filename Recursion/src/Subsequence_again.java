
public class Subsequence_again {
public static String[] findsubsequence(String str)
{
	String output="";
	if(str.length()==0)
	{
		String ans[]= {" "};
		return ans;
	}
	String small_Ans[]=findsubsequence(str.substring(1)); 
String ans[]= new String[2*small_Ans.length];
for(int i=0;i<small_Ans.length;i++)
{
	ans[i]=small_Ans[i];
}
for(int i=0;i<small_Ans.length;i++)
{
	ans[i+small_Ans.length]=str.charAt(0)+small_Ans[i];
}
	
return ans;
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="xyz";
String ans[]= findsubsequence(str);
for(int i=0;i<ans.length;i++)
{
	System.out.println(ans[i]);
}

}
}