package String;

public class Reverse_a_String {


		public static String reverse1(String str)
		{
			
		if(str.length()==0)
		{
			return str;
		}
//		String output="";
		String output=str.charAt(str.length()-1)+"";
		
		
			//output=output+str.charAt(str.length()-1);
		
		  //reverse1(str.substring(0,str.length()-1));
		return output+reverse1(str.substring(0,str.length()-1));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="apple world jason";
	
	System.out.println(reverse1(str));
	
	}

}