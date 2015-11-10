package algorithm_problem;

import java.util.Scanner;

public class TallOrder_2458 {

	public static int[][] arr = new int[505][505];
	public static boolean[] visited = new boolean[505];
	static int node_n, edge_n;
	static int result = 0;
	public static void input(){
		Scanner scan = new Scanner(System.in);
		node_n = scan.nextInt();
		edge_n = scan.nextInt();
		
		for(int i = 1;i <= edge_n;i++){
			int x, y;
			x = scan.nextInt(); y = scan.nextInt();
			arr[x][y] = 1; arr[y][x] = 2;
		}
	}
	
	public static void print(){
		System.out.println(result);
	}
	
	public static void process(){
		for(int i = 1;i<=node_n;i++){
			init_visited();
			tall_dfs(i);
			short_dfs(i);
			if(check_student()) result++;
		}
	}
	
	public static void init_visited(){
		for(int i = 1;i<=node_n;i++){
			visited[i] = false;
		}
	}
	public static boolean check_student(){
		for(int i = 1;i<=node_n;i++){
			if(!visited[i])
				return false;
		}
		return true;
	}
	
	public static void tall_dfs(int x){
		visited[x] = true;
		for(int i = 1;i<=node_n;i++){
			if(arr[x][i] == 1 && !visited[i]){
				tall_dfs(i);
			}
		}
	}
	
	public static void short_dfs(int x){
		visited[x] = true;
		for(int i = 1;i<=node_n;i++){
			if(arr[x][i] == 2 && !visited[i]){
				short_dfs(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		process();
		print();
	}

}
