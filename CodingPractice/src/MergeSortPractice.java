
public class MergeSortPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 8, 1, 4, 9, 7, 10, 3, 2, 6};
		print(arr);
		merge_sort(arr, 0, arr.length - 1);
		print(arr);
	}
	
	public static void print(int[] arr){
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void merge_sort(int[] arr, int left, int right){
		if(left < right){
			int middle = (left + right) / 2;
			merge_sort(arr, left, middle);
			merge_sort(arr, middle + 1, right);
			merge(arr, left, middle, right);
		}
	}
	public static void merge(int[] arr, int left, int middle, int right){
		int[] helper = new int[arr.length];
		for(int i = left;i<=right;i++){
			helper[i] = arr[i];
		}
		int left_idx = left;
		int right_idx = middle + 1;
		int current = left;
		
		while(left_idx <= middle && right_idx <= right){
			if(helper[left_idx] < helper[right_idx]){
				arr[current++] = helper[left_idx++];
			}
			else{
				arr[current++] = helper[right_idx++];
			}
		}
		int remaining = middle - left_idx;
		for(int i = 0;i<=remaining;i++){
			arr[current + i] = helper[left_idx + i];
		}
	}

}
