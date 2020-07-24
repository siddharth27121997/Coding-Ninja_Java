
public class Static_function {
	String name;
 public int roll_number;
	static int count_ofstudent;
	
	public Static_function(String name,int rollnumber)
	{
		this.name=name;
		this.roll_number=rollnumber;
		count_ofstudent++;
	}
	

public void print()
{
	System.out.println(name + " " + roll_number);
	
}
}
