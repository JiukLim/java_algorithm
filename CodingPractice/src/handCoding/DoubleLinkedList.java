package handCoding;

public class DoubleLinkedList {
	
	public static class Node{
		Node next;
		Node prev;
		int value;
		public Node(int value){
			next = null;
			prev = null;
			this.value = value;
		}
		public void setNext(Node next){
			this.next = next;
		}
		public void setPrev(Node prev){
			this.prev = prev;
		}
		public Node getNext(){
			return this.next;
		}
		public Node getPrev(){
			return this.prev;
		}
	}
	
	public static void insertAfterNode(int value, Node target){
		Node newNode = new Node(value);
		Node next = target.next;
		target.next = newNode;
		newNode.prev = target;
		newNode.next = next;
		next.prev = newNode;
	}
	public static void insertLastNode(Node head, int value){
		Node newNode = new Node(value);
		while(head.next != null){
			head = head.next;
		}
		head.next = newNode;
		newNode.prev = head;
	}
	public static Node findNode(Node head, int value){
		while(head != null){
			if(head.value == value){
				return head;
			}
			head = head.next;
		}
		return null;
	}
	public static void printNode(Node head){
		while(head != null){
			System.out.print(head.value + " ");
			head = head.next;
		}
		System.out.println();
	}
	public static void reversePrintNode(Node head){
		while(head.next != null){
			head = head.next;
		}
		while(head != null){
			System.out.print(head.value + " ");
			head= head.prev;
		}
		System.out.println();
	}
	public static void deleteNode(Node head, int value){
		while(head != null){
			if(head.value == value){
				break;
			}
			head = head.next;
		}
		if(head == null){
			System.out.println("error");
			return;
		}
		if(head.next == null){
			Node prev = head.prev;
			prev.next = null;
			head.prev = null;
		}
		else if(head.prev == null){
			Node next = head.next;
			head.next = null;
			next.prev = null;
		}
		else{
			Node prev = head.prev;
			Node next = head.next;
			prev.next = next;
			next.prev = prev;
		}
	}

	public static void main(String[] args){
		Node head = new Node(1);
		insertLastNode(head, 2);
		insertLastNode(head, 3);
		insertLastNode(head, 4);
		insertLastNode(head, 5);
		insertLastNode(head, 6);
		
		printNode(head);
		reversePrintNode(head);
		
		deleteNode(head, 3);
		printNode(head);
		
		deleteNode(head, 6);
		printNode(head);
		
		deleteNode(head, 2);
		printNode(head);
	}
}
