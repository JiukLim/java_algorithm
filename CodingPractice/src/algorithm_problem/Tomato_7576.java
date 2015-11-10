package algorithm_problem;

import java.util.Queue;
import java.util.Scanner;


public class Tomato_7576 {
	
	public static class Coord{
		int x, y, rippentime;
		public Coord(int x, int y, int rippentime){
			this.x = x;
			this.y = y;
			this.rippentime = rippentime;
		}
	}
	
	public static int[][] arr = new int[1005][1005];
	public static boolean[][] visited = new boolean[1005][1005];
	public static int[][] rippen_time = new int[1005][1005];
	public static Queue<Coord> q;
	public static int garo_M, sero_N;
	
	public static void input(){
		Scanner scan = new Scanner(System.in);
		garo_M = scan.nextInt();
		sero_N = scan.nextInt();
		for(int i = 1;i<=sero_N;i++){
			for(int j = 1;j<=garo_M;j++){
				arr[i][j] = scan.nextInt();
				if(arr[i][j] == 1){
					visited[i][j] = true;
					Coord pushdata = new Coord(i, j, 0);
					q.add(pushdata);
				}
			}
		}
	}
	public static void init(){
		for(int i = 0;i<=sero_N + 1;i++){
			for(int j = 0;j<=garo_M;j++){
				arr[i][j] = -1;
				
			}
		}
	}
	public static void bfs(){
		while(!q.isEmpty()){
			Coord current = q.peek();
			q.poll();
			
		}
	}
	
	
	public static void print(){
		for(int i = 1;i<=sero_N;i++){
			for(int j = 1;j<=garo_M;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init();
		input();
		bfs();
		print();
	}

}
