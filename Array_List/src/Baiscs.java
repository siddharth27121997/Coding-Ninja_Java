import java.util.*;
public class Baiscs {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list1= new ArrayList<Integer> ();
		System.out.println(list1.size());
		list1.add(20);
		list1.add(40);
		list1.add(60);
		list1.add(2,45);
		list1.set(1, 200);
		for(int i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i)+" ");
		}
		System.out.println();
	for(int element:list1)
	{
		System.out.print(element+" ");
	}
	System.out.println();
	
System.out.println(list1.size());
list1.remove(1);
for(int i=0;i<list1.size();i++)
{
	System.out.print(list1.get(i)+" ");
}
System.out.println();
	}
}
