package handCoding;

public class ReverseLinkedList {
	
	public static class Node{
		Node next;
		int value;
		public Node(int value){
			this.value = value;
			this.next = null;
		}
		public void setNext(Node next){
			this.next = next;
		}
	}
	
	public static Node reverseList(Node Head){
		Node node = Head;
		Node reverse = null;
		Node returnReverse = null;
		
		while(node != null){
			Node prev = node;
			while(node.next != null){
				prev = node;
				node = node.next;
			}
			if(reverse == null){
				reverse = node;
				returnReverse = reverse;
			}
			else{
				reverse.next = node;
				reverse = reverse.next;
			}
			prev.next = null;
			node = Head;
			
			if(prev == node){
				// 노드 삽입
				reverse.next = node;
				node = null;
			}
		}
		return returnReverse;
	}
	
	public static Node ListReverse(Node Head){
		Node FinalHead = null;
		Node curNode, preNode, tempNode;
		preNode = null;
		curNode = Head;
		
		if(curNode != null){
			while(curNode.next != null){
				tempNode = curNode.next;
				curNode.next = preNode;
				preNode = curNode;
				curNode = tempNode;
			}
			curNode.next = preNode;
			FinalHead = curNode;
		}
		return FinalHead;
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.setNext(node2);		
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		
		final Node head = node1;
		
//		Node reverseHead = reverseList(head);
		Node reverseHead = ListReverse(head);
		while(reverseHead != null){
			System.out.print(reverseHead.value + " ");
			reverseHead = reverseHead.next;
		}System.out.println();
	}

}
