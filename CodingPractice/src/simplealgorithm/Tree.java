package simplealgorithm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tree {
	public Tree left;
	public Tree right;
	public int value;
	public boolean visited = false;
	
	public Tree(int value){
		this.left = null;
		this.right = null;
		this.value = value;
	}
	public void setLeft(Tree node){
		this.left = node;
	}
	public void setRight(Tree node){
		this.right = node;
	}
	public Tree getLeft(){
		return this.left;
	}
	public Tree getRight(){
		return this.right;
	}
	
	public static int getHeight(Tree Root){
		if(Root == null) return 0;
		return Math.max(getHeight(Root.getLeft()), getHeight(Root.getRight())) + 1;
	}
	
	public static boolean isBalanced(Tree Root){
		if(Root == null) return true;
		int heightDiff = getHeight(Root.getLeft()) - getHeight(Root.getRight());
		if(Math.abs(heightDiff) > 1){
			return false;
		}else{
			return true;
		}
	}
	
	public static boolean dfs(Tree node, Tree target){
		node.visited = true;
		// System.out.println(node.value + " - " + target.value);
		if(node.value == target.value){
			return true;
		}
		if(node.getLeft() != null && node.getLeft().visited == false){
			dfs(node.getLeft(), target);
		}
		if(node.getRight() != null && node.getRight().visited == false){
			dfs(node.getRight(), target);
		}
		return false;
	}
	
	public static boolean isAvailablePath(Tree a_node, Tree b_node){
		boolean isPath = dfs(a_node, b_node);
		return isPath;
	}
	
	public static Tree makeBalancedBinarySearchTree(int arr[], int start, int end){
		if(end <= start) return null;
		
		int median = (start + end) / 2;
		Tree node = new Tree(arr[median]);
		node.left = makeBalancedBinarySearchTree(arr, start, median - 1);
		node.right = makeBalancedBinarySearchTree(arr, median + 1, end);
		return node;
	}
	
	public static void createLevelLinkedList (Tree root, ArrayList<LinkedList<Tree>> lists, int level){
		if(root == null) return;
		
	}
	
	public static void main(String[] args) {
		Tree root = new Tree(0);
		Tree node1 = new Tree(1);
		Tree node2 = new Tree(2);
		root.setLeft(node1); root.setRight(node2);
		Tree node3 = new Tree(3);
		Tree node4 = new Tree(4);
		node1.setLeft(node3);node1.setRight(node4);
		Tree node5 = new Tree(5);
		node3.setLeft(node5);
		
		Tree node6 = new Tree(6);
		Tree node7 = new Tree(7);
		Tree node8 = new Tree(8);
		node6.setLeft(node7);node6.setRight(node8);
		
		// System.out.println("Root을 기준으로 왼쪽 서브트리, 오른쪽 서브트리가 균형을 이루나? : " + isBalanced(root));
		System.out.println(isAvailablePath(root, node7));
		
		int arr[] = {1, 2, 3, 4, 5};
		Tree balancedTree = makeBalancedBinarySearchTree(arr, 0, arr.length);
		System.out.println(balancedTree.left.value);
		System.out.println(balancedTree.right.value);
	}
}
