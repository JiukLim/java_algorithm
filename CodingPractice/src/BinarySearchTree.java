import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree<T extends Comparable<T>> {
	private Node root;
	private class Node {
		T value;
		Node left;
		Node right;
		Node(T value,Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}
	
	public BinarySearchTree() {
		root = null;
	}
	
	public void add(T value) {
		if(root==null) root = new Node(value,null,null);
		else {
			add(root,value);
		}
	}
	
	private void add(Node node,T data) {
		if(data.compareTo(node.value)==0) return;
		
		if(data.compareTo(node.value)<0) {
			if(node.left==null) {
				node.left = new Node(data,null,null);
			}
			else {
				add(node.left,data);
			}
		}
		else {
			if(node.right==null) {
				node.right = new Node(data,null,null);
			}
			else {
				add(node.right,data);
			}
		}
	}
	
	public void balanceInsert(T array[]) {
		if(! isSort(array)) throw new IllegalArgumentException("정렬되지 않음");
		insertRecursive(array,0,array.length-1);
	}
	
	private boolean isSort(T array[]) {
		final boolean ascendant = getSortState(array);
		for(int i=0; i<array.length-1; i++) {
			if(ascendant && array[i].compareTo(array[i+1]) > 0) return false;
			if(!ascendant && array[i].compareTo(array[i+1]) < 0) return false;
		}
		return true;
	}
	
	private boolean getSortState(T array[]) {
		for(int i=0; i<array.length-1; i++) {
			if(array[0].compareTo(array[1]) == 0) continue;
			if(array[0].compareTo(array[1]) < 0) return true;
			return false;
		}
		return false;
	}
	
	private void insertRecursive(T array[],int start,int end) {
		if(start > end) return;
		int mid = (start+end)/2;
		add(array[mid]);
		System.out.println(array[mid]);
		insertRecursive(array,start,mid-1);
		insertRecursive(array, mid+1, end);
	}

	public boolean find(T value) {
		return find(root,value);
	}
	
	private boolean find(Node node,T data) {
		if(node == null) return false;
		
		if(node.value.compareTo(data)==0) return true;
		
		else if(data.compareTo(node.value)>0) return find(node.right,data);
		
		else return find(node.left,data);
	}
	
	public void printTree() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int depth = getTreeDepth(root,0);
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			
		}
	}
	private int getTreeDepth(Node node,int depth) {
		if(node==null) return depth-1;
		int leftDepth = getTreeDepth(node.left, depth+1);
		int rightDepth = getTreeDepth(node.right, depth+1);
		return Math.max(leftDepth, rightDepth);
	}
	

	
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.add(5);
		tree.add(2);
		tree.add(3);
		tree.add(5);
		System.out.println(tree.find(2));
		System.out.println(tree.find(3));
		System.out.println(tree.find(5));
		System.out.println(tree.find(6));//FALSE
		
		//정렬된 data가 들어왔을때 균등한 tree로 insert해줌
		BinarySearchTree<Integer> balanceTree = new BinarySearchTree<>();
		Integer array[] = {1,2,3,5,7,9};
//		Integer array[] = {7,6,5,4,3,2,1};
		balanceTree.balanceInsert(array);
	}

}
