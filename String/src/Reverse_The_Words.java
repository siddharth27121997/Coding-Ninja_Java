
public class Reverse_The_Words {
	
	
	public static String function(String str)
	{
		String output="";
      int i=str.length()-1;
      int end=str.length();
      while(i>=0)
      {
    	  if(str.charAt(i)==' ')
    	  {
    		  output=output+str.substring(i+1,end)+" ";
    		  end=i;
    	  }
    	  
    	  
    	  i--;
      }
      output=output+str.substring(0, end);
		return output;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= "Welcome To Coding Zone";
System.out.println(function(str));
	}

}
