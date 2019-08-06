package main.coreJava.MiscCode;
class Node<T>
{
	T data;
	Node next;
	Node(T t) {data = t; next = null; }
}
// Java Program to insert in a sorted list
class MyLinkedList
{ 
	Node head;

	void insertInSortedLinkedList(Node new_node)
	{ 
		Node current; 

		/* Special case for head node */
		if (head == null || (Integer) head.data >= (Integer)new_node.data)
		{ 
			new_node.next = head; 
			head = new_node; 
		} 
		else {
			/* Locate the node before point of insertion. */
			current = head; 

			while (current.next != null && 
					(Integer)current.next.data < (Integer) new_node.data)
				current = current.next; 

			new_node.next = current.next; 
			current.next = new_node; 
		} 
	} 

	/* Function to print linked list */
	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) 
		{ 
			System.out.print(temp.data+" "); 
			temp = temp.next; 
		} 
	} 

	/* Driver function to test above methods */
	public static void main(String args[]) 
	{ 
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.insertInSortedLinkedList(new Node<Integer>(2));
		myLinkedList.insertInSortedLinkedList(new Node<Integer>(5));
		myLinkedList.insertInSortedLinkedList(new Node<Integer>(4));
		myLinkedList.insertInSortedLinkedList(new Node<Integer>(1));
		myLinkedList.insertInSortedLinkedList(new Node<Integer>(9));
		myLinkedList.insertInSortedLinkedList(new Node<Integer>(15));
		myLinkedList.insertInSortedLinkedList(new Node<Integer>(10));
		myLinkedList.printList();
	} 
}