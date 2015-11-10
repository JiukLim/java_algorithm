
public class QuickSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 0, 8, 3, 4};
		print(arr);
		quick_sort(arr, 0, arr.length - 1);
		print(arr);
	}
	
	public static void print(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}System.out.println();
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void quick_sort(int[] arr, int left, int right){
		int index = partition(arr, left, right);
		
		if(left < index - 1){
			quick_sort(arr, left, index - 1);
		}
		if(index < right){
			quick_sort(arr, index, right);
		}
	}
	
	public static int partition(int[] arr, int left, int right){
		int pivot = arr[(left + right) / 2];
	
		while(left <= right){
			while(arr[left] < pivot){
				left++;
			}
			while(arr[right] > pivot){
				right--;
			}
			if(left <= right){
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
}
