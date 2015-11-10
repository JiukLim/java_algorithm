package handCoding;

public class SimpleAlgorithm {
	// hello, world! => !hello, world 로 바꾸는 프로그램 작성
	
	public static void print(String str){
		System.out.print(str.charAt(str.length() - 1));
		for(int i = 0;i<str.length() - 1; i++){
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	public static void main(String[] args) {
		print("hello, world!");
	}
}
