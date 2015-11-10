package handCoding;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HandCoding31 {
	public static void randomNumberSorting(int[] arr){
		List<LinkedList<Integer>> Number = new ArrayList<LinkedList<Integer>>();
		for(int i = 0;i<101;i++){
			LinkedList<Integer> DetailNumber = new LinkedList<Integer>();
			Number.add(DetailNumber);
		}
		for(int i = 0;i<arr.length;i++){
			Number.get(arr[i]).addLast(arr[i]);
		}
		for(int i = 0;i<arr.length;i++){
			if(!Number.get(i).isEmpty()){
				int LinkedSize = Number.get(i).size();
				for(int j = 0;j<LinkedSize;j++){
					System.out.print(Number.get(i).get(j));
				}
			}
		}
		System.out.println();
	}
	public static void NumberSorting(int[] arr){
		int[] NumberTable = new int[100];
		for(int i = 0;i<100;i++){
			NumberTable[i] = -1;
		}
		for(int i = 0;i<arr.length;i++){
			NumberTable[arr[i]] = arr[i];
		}
		
		for(int i = 0;i<arr.length;i++){
			if(NumberTable[i] != -1){
				System.out.print(i + " ");
			}
		}System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {
						2,2,2,2,2,2,2,2,2,2,
						3,3,3,3,3,3,3,3,3,3,
						4,4,4,4,4,4,4,4,4,4,
						9,9,9,9,9,9,9,9,9,9,
						7,7,7,7,7,7,7,7,7,7,
						1,1,1,1,1,1,1,1,1,1,
						8,8,8,8,8,8,8,8,8,8
					};
		randomNumberSorting(arr);
		int[] arr2 = {10,9,8,7,6,5,4,3,2,1};
		NumberSorting(arr2);
	}
}
