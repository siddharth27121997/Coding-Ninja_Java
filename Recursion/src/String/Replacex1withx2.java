package String;

public class Replacex1withx2 {
  public static String replace(String str,char c1, char c2)
  {
	  
	  return replace(str,c1,c2,0);
  }
  
  private static String replace(String str, char c1, char c2,int start)
  {
	  if(str.length()==0)
	  {
		  return str;
	  }
	  String output="";
	  if(str.charAt(start)==c1)
	  {
		  output+=c2+"";
	  }
	  if(str.charAt(start)!=c1)
	  {
		  output=output+str.charAt(start);
	  }
	  return output+replace(str.substring(start+1), c1,  c2);
	  
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abceggg";

System.out.println(replace(str,'g','x'));

	}

}
