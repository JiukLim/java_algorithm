package handCoding;

public class HandCoding9 {
	
	// Integer를 String으로 변환. 123 => "123"
	
	public static String IntToStr(Integer Number){
		int target;
		// char[] result = new char[10];
		StringBuilder result = new StringBuilder();
		int result_idx = 0;
		while(Number != 0){
			target = Number % 10;
			result.append(target);
			Number /= 10;
		}
		// => "321"
		// reverse
		for(int i = 0; i < result.length() / 2;i++){
			char temp = result.charAt(i);
			result.setCharAt(i, result.charAt(result.length() - 1 - i));
			result.setCharAt(result.length() - 1 - i, temp);
		}
		return result.toString();
	}
	
	
	public static String DecToHexDec(int n){
		String Table = "0123456789ABCDEF";
		StringBuilder result = new StringBuilder();
		while(n != 0){
			int current = n % 16;
			result.append(Table.charAt(current));
			n /= 16;
		}
		// reverse
		result.reverse();
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IntToStr(123));
		System.out.println(DecToHexDec(223));
		System.out.println(DecToHexDec(623));
	}

}
