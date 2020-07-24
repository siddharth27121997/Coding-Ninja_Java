
public class ReplacePi_ {
//public static String output="";
	public static String replace(String str)
{

	if(str.length()<=1)
	{
		return str;
	}
	
if(str.charAt(0)=='p' && str.charAt(1)=='i' && str.length()>=2)
{

	
	return"3.14"+ replace(str.substring(2,str.length()));	
}


	
	return str.charAt(0)+replace(str.substring(1,str.length()));

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "pxpix";
		System.out.println(replace(str));
	}

}
