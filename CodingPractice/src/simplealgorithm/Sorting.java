package simplealgorithm;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 8, 0, 2, 1 ,4};
	}
	
	
	private static int[] insertion_sort(int[] arr){
		for(int i = 1;i<arr.length;i++){
			for(int j = 0;j<i;j++){
				if(arr[i] < arr[j]){
					swap(arr, i, j);
				}
			}
		}
		return arr;
	}
	
	private static int[] selection_sort(int[] arr){
		for(int i = 0;i<arr.length;i++){
			int min_value = arr[i];
			for(int j = i;j<arr.length;j++){
				if(arr[j] < min_value){
					arr = swap(arr, i, j);
				}
			}
		}
		return arr;
	}
	
	
	private static int[] bubble_sort(int[] arr){
		for(int i = arr.length - 1; i > 0;i--){
			for(int j = 0;j<i;j++){
				if(arr[j] > arr[j + 1]){
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
	
	private static int[] swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
}
