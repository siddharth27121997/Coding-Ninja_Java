
public class Print_the_list<T> {

	T data;
	Print_the_list <T>next;
	 Print_the_list(T data)
	 {
		 this.data=data;
	      next=null;
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Print_the_list<Integer> node1= new Print_the_list<>(10);
		System.out.println(node1.data);
		System.out.println(node1.next);
		
		Print_the_list<Integer> node2= new Print_the_list<>(20); 
		node1.next=node2;
		Print_the_list<Integer> node3= new Print_the_list<Integer>(40);
		node2.next= node3;
		//node3.next=null;
		Print_the_list<Integer> head= node1;
		while(head!=null)
		{
			System.out.print(head.next+" ");
			head= head.next;
		}
		System.out.println();
		
	}

}
