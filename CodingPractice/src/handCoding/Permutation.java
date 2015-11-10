package handCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Permutation {
	
	public static int count = 0;
	public static HashMap<Integer,Boolean> map = new HashMap<Integer, Boolean>();
	
	public static void makePermutation(int[] arr, Boolean[] visited, int[] result, int result_idx){
		if(result_idx == 4){
			count++;
			for(int i = 0;i<result_idx;i++){
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = 0;i<arr.length;i++){
			if(!visited[i]){
				result[result_idx] = arr[i];
				visited[i] = true;
				makePermutation(arr, visited, result, result_idx + 1);
				visited[i] = false;
			}
		}
	}
	
	public static void makeCombination(int[] arr, Boolean[] visited, int[] result, int result_idx){
		if(result_idx == 2){
			count++;
			for(int i = 0;i<result_idx;i++){
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = result_idx;i<arr.length;i++){
			if(!visited[i]){
				result[result_idx] = arr[i];
				visited[i] = true;
				makeCombination(arr, visited, result, result_idx + 1);
				visited[i] = false;
			}
		}
	}
	
	public static void makecase(int[] arr, int[] result, int result_idx){
		if(result_idx == 4){
			count++;
			for(int i = 0;i<result_idx;i++){
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}
		for(int i = 0;i<arr.length;i++){
			result[result_idx] = arr[i];
			makecase(arr, result, result_idx + 1);
		}
	}
	
	public static void init_boolean(Boolean[] visited){
		for(int i = 0;i<visited.length;i++){
			visited[i] = false;
		}
	}
	
	
	public Boolean assertionTest(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		if(list.get(0) == 11){
			return true;
		}
		else{
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		Boolean[] visited = new Boolean[10];
		init_boolean(visited);
		int[] result = new int[10];
		// makePermutation(arr, visited, result, 0);
		// makePermutation(arr, visited, result, 0);
		// init_boolean(visited);
		// makecase(arr, result, 0);
		
		makeCombination(arr, visited, result, 0);
		System.out.println(count);
	}

}
