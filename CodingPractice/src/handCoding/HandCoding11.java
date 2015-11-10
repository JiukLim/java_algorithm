package handCoding;

public class HandCoding11 {
	
	public static int FindOmitNumber(int[] arr, int n){
		Boolean[] table = new Boolean[n + 1];
		for(int i = 0;i<=n;i++){
			table[i] = false;
		}
		for(int i = 0;i<arr.length;i++){
			table[arr[i]] = true;
		}
		for(int i = 1;i<=n;i++){
			if(!table[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5};
		System.out.println(FindOmitNumber(arr, 5));
	}

}
