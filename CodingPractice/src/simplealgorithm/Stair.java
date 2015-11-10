package simplealgorithm;

public class Stair {
	
	public static int staircase(int n){
		if(n == 1)
			return 1;
		else if(n == 2)
			return 2;
		else if(n == 3)
			return 3;
		else
			return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
	}
	
	public static int countWaysDP(int n, int[] map){
		if(n < 0){
			return 0;
		}
		else if(n == 0){
			return 1;
		}
		else if(map[n] > -1){
			return map[n];
		}
		else{
			map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map) + countWaysDP(n - 3, map);
		}
		return map[n];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(staircase(4));
		int[] map = new int[1000];
		for(int i = 0;i<100;i++){
			map[i] = -1;
		}
		System.out.println(countWaysDP(4, map));
	}

}
