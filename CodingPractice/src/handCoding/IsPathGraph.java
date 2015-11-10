package handCoding;

import java.util.ArrayList;
import java.util.List;

public class IsPathGraph {
	public static class Node{
		public List<Node> connection;
		public int value;
		public Boolean visited;
		public Node(int value){
			this.value = value;
			connection = new ArrayList<Node>();
			visited = false;
		}
		public void setConnection(Node node){
			connection.add(node);
		}
		public List<Node> getConnection(){
			return this.connection;
		}
	}
	
	public static Boolean isPath = false;
	
	public static void dfs(Node node, int target){
		node.visited = true;
		if(node.value == target){
			isPath = true;
		}
		System.out.println(node.value);
		List<Node> connection = node.getConnection();
		for(int i = 0;i<connection.size();i++){
			if(!connection.get(i).visited){
				dfs(connection.get(i), target);
			}
		}
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		
		Node node6 = new Node(6);
		
		node1.setConnection(node2);
		node1.setConnection(node3);
		
		node2.setConnection(node1);
		
		node3.setConnection(node1);
		node3.setConnection(node5);
		node3.setConnection(node4);
		
		node4.setConnection(node3);
		node4.setConnection(node5);
		
		node5.setConnection(node3);
		node5.setConnection(node4);
		
		dfs(node1, 6);
		System.out.println(isPath);
	}

}
