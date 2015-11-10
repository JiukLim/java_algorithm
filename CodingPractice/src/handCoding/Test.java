package handCoding;

public class Test {
	public static int fibonacci(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		else{
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}
	public static int dp_fibonacci(int n){
		int[] fibo = new int[1000];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i = 2;i<=n;i++){
			fibo[i] = fibo[i - 2] + fibo[i - 1];
		}
		return fibo[n];
	}
	public static int dp_fibonacci(int n, int[] fibo){
		if(n <= 1)
			return n;
		if(fibo[n] != 0)
			return fibo[n];
		else
			return fibo[n] = dp_fibonacci(n - 2, fibo) + dp_fibonacci(n - 1, fibo);
	}
	public static void main(String[] args) {
		// System.out.println(fibonacci(100));
		int result = dp_fibonacci(30);
		System.out.println(result);
		int[] fibo = new int[1000];
		System.out.println(dp_fibonacci(30, fibo));
	}

}
