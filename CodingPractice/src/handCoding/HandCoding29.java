package handCoding;

import java.util.HashMap;

public class HandCoding29 {
	// 16진수 => 10진수 변환
	public static int HexDecToDec(String HexaDecimal){
		int Decimal = 0;
		HashMap<Character, Integer> Table = new HashMap<Character, Integer>();
		Table.put('0', 0);Table.put('1', 1);Table.put('2', 2);Table.put('3', 3);Table.put('4', 4);Table.put('5', 5);
		Table.put('6', 6);Table.put('7', 7);Table.put('8', 8);Table.put('9', 9);Table.put('A', 10);Table.put('B', 11);
		Table.put('C', 12);Table.put('D', 13);Table.put('E', 14);Table.put('F', 15);
		
		int jarisu = 1;
		for(int i = HexaDecimal.length() - 1;i >= 0; i--){
			char current = HexaDecimal.charAt(i);
			int number = Table.get(current);
			Decimal += number * jarisu;
			jarisu *= 16;
		}
		return Decimal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(HexDecToDec("1A"));
	}
}
