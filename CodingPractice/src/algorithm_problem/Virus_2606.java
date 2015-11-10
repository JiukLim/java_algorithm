package algorithm_problem;

import java.util.Scanner;

public class Virus_2606 {
	
	public static int[][] arr = new int[105][105];
	public static boolean[] visited = new boolean[105];
	public static int n, edge_n;
	public static int result = -1;
	
	public static void input(){
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		edge_n = scan.nextInt();
		for(int i = 1;i<=edge_n;i++){
			int computer_x, computer_y;
			computer_x = scan.nextInt();
			computer_y = scan.nextInt();
			arr[computer_x][computer_y] = 1;
			arr[computer_y][computer_x] = 1;
		}
	}
	
	public static void dfs(int x){
		visited[x] = true;
		result++;
		for(int i = 1;i<=n;i++){
			if(arr[x][i] == 1 && !visited[i]){
				dfs(i);
			}
		}
	}
	
	public static void process(){
		dfs(1);
	}
	public static void print(){
		System.out.println(result);
		
		
	}
	
	public static void main(String[] args) {
		 input();
		 process();
		 print();
	}

}
