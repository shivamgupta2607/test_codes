package linkedlist;

public class LinkedList {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private void addNodeAtEnd(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node p = head;
		while(p.next != null)
		{
			p = p.next;
		}
		p.next = newNode;
		return;
	}
	
	private void addNodeAtBegin(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	private boolean addNodeAfterKey(int data, int key)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			return false;
		}
		Node p = head;
		while(p != null && p.data != key)
		{
			p = p.next;
		}
		if(p == null)
			return false;
		newNode.next = p.next;
		p.next = newNode;
		return true;
		
	}
	
	private int deleteHead()
	{
		Node p = head;
		head = p.next;
		return p.data;
	}
	
	private boolean deleteKey(int key)
	{
		if(head.data == key)
		{
			deleteHead();
			return true;
		}
		
		Node p = head;
		while (p.next != null && p.next.data != key)
		{
			p = p.next;
		}
		if(p.next == null)
			return false;
		p.next = p.next.next;
		return true;
		
	}

/*	private void swap(int a, int b)
	{
		Node p,q;
		
		if(head.data == a)
		{
			p = head;
		}
		else if(head.data == b)
		{
			q = head;
		}
			
		if(p == null)
		{
			while ( )
		}
	}*/
	
	
	private void display()
	{
		Node p = head;
		while(p != null)
		{
			System.out.print(p.data+ "  ");
			p = p.next;
		}
		System.out.println();
	}
	
	private void reverse() {
		Node prev = null;
		Node curr = head;
		Node nxt ;
		while( curr!=null)
		{	
			nxt = curr.next;
			curr.next=prev;
			prev=curr;
			curr=nxt;
		}
		head=prev;
	}
	private void reverse(int o)
	{
		Node prev = null;
		Node curr = head;
		Node nxt ;
		int count = 0;
		while( curr!=null)
		{	
			if(count%o != 0)
			{

			}
			else
			{
				
			}
			nxt = curr.next;
			curr.next=prev;
			prev=curr;
			curr=nxt;
			count++;
		}
		head=prev;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addNodeAtBegin(8);
		list.addNodeAtEnd(2);
		list.addNodeAtEnd(1);
		list.addNodeAtEnd(3);
		
		list.addNodeAtBegin(4);
		
		//list.deleteKey(4);

		
		list.addNodeAtEnd(5);
		
		list.addNodeAfterKey(7, 3);
		
		//list.deleteKey(3);
		
		list.addNodeAtEnd(10);
		list.addNodeAfterKey(9, 4);
		list.display();
		//list.reverse();
		list.reverse(3);
		list.display();
		//System.out.println(list.deleteHead());
		//list.display();

	}


}
