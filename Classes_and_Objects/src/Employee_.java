
public class Employee_ {
	
	private String name;
	public int rollnumber;
	public Employee_(String str)
	{
		if(str.charAt(0)=='R')
		{
		name=str;
		}
		
		
	}
	
	public Employee_(String str,int rn)
	{
		if(str.charAt(0)=='R')
		{
		name=str;
		}
		rollnumber = rn;
		
	}
	
	
	
	
	public String get_name()
	{
		return name;
	}
	public void print()
	{
		System.out.println(name+ "  " +rollnumber);
		
	}

	
	

}
