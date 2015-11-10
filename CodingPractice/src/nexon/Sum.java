package nexon;

public class Sum {
public static int sum_atob(int a, int b) {
	int n = b - a + 1;
	return n * (a + b) / 2;
}

public static int sum() {
	return 1 << 1;
}

public static int sum_prime(int max) {
	boolean primeArray[] = new boolean[max + 1];
	int limit = (int) Math.sqrt(max);
	for (int num = 2; num <= limit; num++) {
		if (!primeArray[num]) {
			for (int i = num * num; i <= max; i += num)
				primeArray[i] = true;
		}
	}
	return sumPrimeArray(primeArray);
}

public static int sumPrimeArray(boolean array[]) {
	int sum = 0;
	for (int i = 2; i < array.length; i++) {
		if (!array[i])
			sum += i;
	}
	return sum;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(sum_atob(1, 3));
		// System.out.println(sum());
		// System.out.println(sum_prime(10));
	}

}
