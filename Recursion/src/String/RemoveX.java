package String;

public class RemoveX {

	public static String remove_x(String str)
	{
		
		return remove_x(str,0);
	}
	
	private static String remove_x(String str,int start)
	{
		if(str.length()==0)
		{
			return str;
		}
		if(str.charAt(start)=='x')
	 {
			return remove_x(str.substring(start+1));
			
     }
		return str.charAt(start)+remove_x(str.substring(start+1));
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="xxxxg";
		System.out.println(remove_x(str));
		
	}

}
