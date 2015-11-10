package handCoding;

public class HandCoding3 {
	
	// unsigned Integer가 있을 때 a + b가 max(a,b)보다 작을 때가 있는지 설명하고 , 이 두 unsigned Integer를 safe하게 
	// 더하는 abb(a, b) function을 작성하세요. 참고로 add() function은 error를 리턴하게 해도 됩니다. 
	
	/* 자바에서는 unsinged int 형을 제공하지 않는다. long형으로 캐스팅 할 수 있다. */
	public static int sum(int a, int b){
		int sum = a + b;
		if(sum < Math.max(a, b)){
			return -1;
		}
		else{
			return sum;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = sum(2147483647, 10);
		if(result == -1){
			System.out.println("error");
		}
		else{
			System.out.println(result);
		}
		
		// 2147483647
	}
	
	
	public static long unsigned32(int n){
		return n & 0xFFFFFFFFL;
	}
}
