
public class LinkedList_Use {
public static void print(Node1<Integer> head)
{
	Node1<Integer> temp=head;
	while(head!=null)
	{
		System.out.print(head.data+" ");
	head=head.next;
	
	}
	System.out.println();
	head= temp;
	while(head!=null)
	{
	System.out.print(head.data+" ");	
	head= head.next;
	//System.out.println();
	}
	System.out.println();
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node1<Integer> node1= new Node1<Integer>(10);
		Node1<Integer> node2= new Node1<Integer>(20);
		Node1<Integer> node3= new Node1<Integer>(30);
		node1.next=node2;
		node2.next=node3;
		Node1<Integer> head= node1;
		print(head);
		print(head);
		
	}

}
