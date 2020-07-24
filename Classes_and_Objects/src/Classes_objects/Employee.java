package Classes_objects;

public class Employee {

	private String name;
	int employee_id;
public	 void set_name(String str)

	{
	
	if(str.charAt(0)=='R')
	{
		name=str;
	}
		//name=str;
		
	}
 public String get_name()
{
	return name;
}
public void set_id(int n)
{
	employee_id=n;
}


public int get_id()
{
	return employee_id;
}


}
