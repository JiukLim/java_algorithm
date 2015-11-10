package algorithm_problem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Miro_2178 {

	public static class coord{
		int x, y, length;
		public coord(int x, int y, int length){
			this.x = x;
			this.y = y;
			this.length = length;
		}
	}
	
	public static int N, M;
	public static int[][] arr = new int[105][105];
	public static boolean[][] visited = new boolean[105][105];
	public static Queue<coord> q = new LinkedList<Miro_2178.coord>();
	public static int result = -1;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
		process();
		System.out.println(result);
	}
	
	public static void input(){
		Scanner scan = new Scanner(System.in);
		N = scan.nextInt();
		M = scan.nextInt();
		for(int i = 1;i<=N;i++){
			for(int j = 1;j<=M;j++){
				arr[i][j] = scan.nextInt();
			}
		}
	}
	public static void bfs(){
		while(!q.isEmpty()){
			coord current = q.peek();
			q.poll();
			visited[current.x][current.y] = true;
			if(current.x == N && current.y == M){
				result = current.length;
			}
			if(arr[current.x - 1][current.y] == 1 && !visited[current.x - 1][current.y]){
				visited[current.x - 1][current.y] = true;
				coord pushdata = new coord(current.x - 1, current.y, current.length + 1);
				q.add(pushdata);
			}
			if(arr[current.x + 1][current.y] == 1 && !visited[current.x + 1][current.y]){
				visited[current.x + 1][current.y] = true;
				coord pushdata = new coord(current.x + 1, current.y, current.length + 1);
				q.add(pushdata);
			}
			if(arr[current.x][current.y - 1] == 1 && !visited[current.x][current.y - 1]){
				visited[current.x][current.y - 1] = true;
				coord pushdata = new coord(current.x, current.y - 1, current.length + 1);
				q.add(pushdata);
			}
			if(arr[current.x][current.y + 1] == 1 && !visited[current.x][current.y + 1]){
				visited[current.x][current.y + 1] = true;
				coord pushdata = new coord(current.x, current.y + 1, current.length + 1);
				q.add(pushdata);
			}
		}
	}
	
	public static void process(){
		coord push = new coord(1, 1, 1);
		visited[1][1] = true;
		q.add(push);
		bfs();
	}

}
