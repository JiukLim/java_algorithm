package handCoding;

import java.util.LinkedList;
import java.util.Queue;

public class HandCoding32 {
	public static class Node{
		Node left;
		Node right;
		int value;
		public Node(int value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	public static Node findNode(Node Root, int target){
		if(target < Root.value){
			return findNode(Root.left, target);
		}
		else if(target > Root.value){
			return findNode(Root.right, target);
		}
		else{
			return Root;
		}
	}
	public static Node findMinNode(Node Root){
		if(Root == null){
			return null;
		}
		if(Root.left != null){
			return findMinNode(Root.left);
		}
		else{
			return Root;
		}
	}
	public static void insertNode(Node Root, int value){
		if(value < Root.value){
			if(Root.left == null){
				Node InsertNode = new Node(value);
				Root.left = InsertNode;
			}else{
				insertNode(Root.left, value);
			}
		}
		else if(value > Root.value){
			if(Root.right == null){
				Node InsertNode = new Node(value);
				Root.right = InsertNode;
			}
			else{
				insertNode(Root.right, value);
			}
		}
		else{
			System.out.println("이미 데이터 있음");
		}
	}
	public static void removeNode(Node Root, Node parent, int target){
		if(target < Root.value){
			removeNode(Root.left, Root, target);
		}
		else if(target > Root.value){
			removeNode(Root.right, Root, target);
		}
		else{
			// 자식이 두 개 다 잇는 경우
			if(Root.left != null && Root.right != null){
				Node minNode = findMinNode(Root);
				Root.value = minNode.value;
				removeNode(Root.left, Root, minNode.value);
			}
			else{
				if(Root.left == null && Root.right == null){
					if(parent.left == Root){
						parent.left = null;
					}else{
						parent.right = null;
					}
				}
				else if(Root.left == null){
					Root.value = Root.right.value;
					Root.right = null;
				}
				else{
					Root.value = Root.left.value;
					Root.left = null;
				}
			}
		}
	}
	
	public static void levelOrder(Node Root){
		Queue<Node> q = new LinkedList<HandCoding32.Node>();
		q.add(Root);
		while(!q.isEmpty()){
			Node current = q.peek();
			q.poll();
			System.out.print(current.value + " ");
			if(current.left != null){
				q.add(current.left);
			}
			if(current.right != null){
				q.add(current.right);
			}
		}
		System.out.println();
	}
	
	public static int FindDepth(Node Root){
		if(Root == null){
			return 0;
		}
		else{
			return 1 + Math.max(FindDepth(Root.left), FindDepth(Root.right));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node Root = new Node(10);
		insertNode(Root, 7);
		insertNode(Root, 12);
		insertNode(Root, 3);
		insertNode(Root, 8);
		insertNode(Root, 15);
		insertNode(Root, 1);
		
		System.out.println(FindDepth(Root));
		
		levelOrder(Root);
		removeNode(Root, null, 1);
		levelOrder(Root);
		removeNode(Root, null, 7);
		levelOrder(Root);
	}

}
