package handCoding;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class HandCoding40 {
	/*
	 * 40억개의 랜덤한 수열이 있을 때 이 중 작은 10개의 숫자를 찾는 알고리즘을 구현하라.
	 * 필요에 따라서 100개의 수로 하겠음
	 * */
	
	public static int[] init(int[] arr){
		for(int i =0;i < 100;i++){
			arr[i] = (int)(Math.random() * 100);
		}
		return arr;
	}
	
	public static List<Integer> findSmaller(int[] arr){
		List<Integer> result = new LinkedList<Integer>();
		for(int i = 0;i<10;i++){
			result.add(arr[i]);
		}
		Collections.sort(result);
		for(int i = 10;i<100;i++){
			for(int j = 0;j<10;j++){
				if(arr[i] < result.get(j)){
					result.add(j, arr[i]);
					break;
				}
			}
		}
		// O(10 * n)
		return result;
	}

	public static void main(String[] args) {
		int[] arr= new int[100];
		arr = init(arr);
		for(int i = 0;i<100;i++){
			System.out.print(arr[i] + " ");
		}System.out.println();
		List<Integer> result = findSmaller(arr);
		for(int i = 0;i<10;i++){
			System.out.print(result.get(i) + " ");
		}System.out.println();
	}

}
