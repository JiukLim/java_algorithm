package datastructure;

public class BinarySearchTree {
	BinarySearchTree left;
	BinarySearchTree right;
	int value;
	
	public BinarySearchTree(int value) {
		// TODO Auto-generated constructor stub
		BinarySearchTree left = null;
		BinarySearchTree right = null;
		this.value = value;
	}
	
	public BinarySearchTree findNode(BinarySearchTree Node, int value){
		if(value < Node.value){
			return findNode(Node.left, value);
		}
		else if(value > Node.value){
			return findNode(Node.right, value);
		}
		else{
			return Node;
		}
	}
	
	public void BST_Insert(BinarySearchTree Tree, int value){
		if(value < Tree.value){
			if(Tree.left != null){
				BST_Insert(Tree.left, value);
			}else{
				BinarySearchTree newNode = new BinarySearchTree(value);
				Tree.left = newNode;
			}
		}
		else if(value > Tree.value){
			if(Tree.right != null){
				BST_Insert(Tree.right, value);
			}else{
				BinarySearchTree newNode = new BinarySearchTree(value);
				Tree.right = newNode;
			}
		}
		else{
			// 이미 삽입하고자 하는 값이 존재한다면
			System.out.println("이미 값이 존재합니다.");
		}
	}
	
	public BinarySearchTree findMinNode(BinarySearchTree Tree){
		if(Tree == null) return null;
		if(Tree.left != null) 
			return findMinNode(Tree.left);
		else 
			return Tree;
	}
	
	/* 미완 */
	public void BST_delete(BinarySearchTree Tree, BinarySearchTree parent, int target){
		if(Tree == null){
			return;
		}
		if(target < Tree.value){
			BST_delete(Tree.left, Tree, target);
		}
		else if(target > Tree.value){
			BST_delete(Tree.right, Tree, target);
		}
		else{
			// 찾았음
			// 자식이 없는 경우
			if(Tree.left != null && Tree.right != null){
				BinarySearchTree minNode = findMinNode(Tree);
				Tree.value = minNode.value;
				BST_delete(Tree, parent, target);
			}
			else{
				if(Tree.left == null && Tree.right == null){
					if(parent.left == Tree){
						parent.left = null;
					}
					else{
						parent.right = null;
					}
				}
				else if(Tree.left == null){
					Tree.value = Tree.right.value;
					Tree.right = null;
				}
				else{
					Tree.value = Tree.left.value;
					Tree.left = null;
				}
			}
		}
	}
	
	public void printTree(BinarySearchTree root){
		if(root.left != null)printTree(root.left);
		System.out.print(root.value + " ");
		if(root.right != null)printTree(root.right);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree Root = new BinarySearchTree(10);
		Root.BST_Insert(Root, 7);
		Root.BST_Insert(Root, 12);
		Root.BST_Insert(Root, 15);
		Root.BST_Insert(Root, 3);
		Root.BST_Insert(Root, 1);
		Root.BST_Insert(Root, 8);
		
		Root.printTree(Root);
		System.out.println();
		
		Root.BST_delete(Root, null, 1);
		
		Root.printTree(Root);
		
	}

}

