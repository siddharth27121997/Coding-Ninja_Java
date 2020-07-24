
public class Final_Keyword {
	
public	String name;
	public final   int  roll_number;
	
	
	public  Final_Keyword(String name,int roll_number)
	{
		this.name=name;
				
		this.roll_number=45;
		//numcount++;
	}
	
	public String get_String()
	{
		return name;
	}
	
	public int get_rollnumber()
	{
		return roll_number;
	}


public void print()
{
System.out.println(name + " " + roll_number);	
}
}