package handCoding;

import java.util.ArrayList;
import java.util.List;

public class HandCoding13 {
	
	public static class Node{
		Node next;
		int value;
		public Node(int value){
			this.value = value;
			this.next = null;
		}
	}
	
//	public static Node reverseList(Node node){
//		Node prev = null;
//		Node next;
//		while(node != null){
//			next = node.next;
//			node.next = prev;
//		}
//	}
	
	public static void calculate(Node node){
		// 43267
//		Node reversehead = reverseList(node);
//		while(reversehead != null){
//			System.out.print(reversehead.value);
//			reversehead = reversehead.next;
//		}
		// 76234
	}

	public static void main(String[] args) {
		Node head = new Node(4); 
		Node second = new Node(3);
		Node third = new Node(2);
		Node fourth = new Node(6);
		Node fifth = new Node(7);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		calculate(head);
	}

}
