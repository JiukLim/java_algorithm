package simplealgorithm;

import java.util.HashMap;

public class NumberSystem {
	
	public int HexaDecimalToDecimal(String Hexdecimal){
		HashMap<Character, Integer> Table = new HashMap<Character, Integer>();
		Table.put('0', 0);Table.put('1', 1);Table.put('2', 2);Table.put('3', 3);Table.put('4', 4);Table.put('5', 5);
		Table.put('6', 6);Table.put('7', 7);Table.put('8', 8);Table.put('9', 9);Table.put('A', 10);
		Table.put('B', 11);Table.put('C', 12);Table.put('D', 13);Table.put('E', 14);Table.put('F', 15);
		
		int target = 1; int result = 0;
		for(int i = Hexdecimal.length() - 1; i >= 0;i--){
			int current = Table.get(Hexdecimal.charAt(i));
			result += current * target;
			target *= 16;
		}
		return result;
	}
	
	public int BinaryToDecimal(String Binary){
		
		return 0;
	}
	
	public static int FindOmissionNumber(int number[]){
		int numbersum = 0, comparesum = 0;
		for(int i = 0;i<number.length;i++){
			numbersum += number[i];
		}
		for(int i = 0;i<number.length;i++){
			comparesum += i + 1;
		}
		return comparesum - numbersum;
	}
	
	public static int[] merge_arrays(int[] A, int[] B){
		int[] result = new int[A.length + B.length];
		int A_idx = 0, B_idx = 0, R_idx = 0;
		while(R_idx < A.length + B.length){
			if(A_idx == A.length){
				result[R_idx++] = B[B_idx++];continue;
			}else if(B_idx == B.length){
				result[R_idx++] = A[A_idx++];continue;
			}
			if(A[A_idx] < B[B_idx])
				result[R_idx++] = A[A_idx++];
			else
				result[R_idx++] = B[B_idx++];
		}
		return result;
	}
	
}
