
public class Output1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int re1=1;
int re=4;
if(re1>2)
{
	for(int i=0;i<re1;i++)
	{
		System.out.println(i);
	}
	

	
}	
System.out.println(re1+" "+re);
	
	}

}*/
int n=12345;
int count= (int)Math.log10(n)+1;
int arr[]= new int[count];
for(int i=0;i<arr.length;i++)
{
	arr[i]=n%10;
	n/=10;
}

for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr[i]+" ");
	
}
System.out.println();
System.out.println(arr);

}
	
	
}