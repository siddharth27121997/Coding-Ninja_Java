
public class ConceptsOfStrings {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="abc";
		String str2="abc";
		if(str1.equals(str2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Unequal");
		}
		
		
		int arr1[]= {3,4,3,2};
		int arr2[]= {3,4,3,2};
		if(arr1==arr2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("False");
		}
		
		System.out.println(arr1);
		System.out.println(arr2);
		int i=0;
		while(i<arr1.length)
		{
			if(arr1[i]!=arr2[i])
			{
				
			System.out.println("false");
				i++;
				break;
				
			}
			
		
		
		}
		System.out.println("True");
	}
			
				
}


