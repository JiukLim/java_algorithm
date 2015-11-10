package simplealgorithm;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = {3, 8, 0, 2, 1, 4};
		int[] arr = {3, 1, 5, 2, 4};
		print(arr);
		quickSort(arr, 0, arr.length - 1);
		print(arr);
	}
	
	public static void print(int[] arr){
		for(int i =0;i<arr.length;i++) System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	public static void swap(int[] arr, int left, int right){
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	} 
	public static void quickSort(int[] arr, int left, int right){
		int index = partition(arr, left, right);
		if(left < index - 1){		// 왼쪽 파티션 정렬
			quickSort(arr, left, index - 1);
		}
		if(index < right){			// 오른쪽 파티션 정렬
			quickSort(arr, index, right);
		}
	}
	public static int partition(int[] arr, int left, int right){
		// int pivot = arr[(left + right)/ 2];	// 분할 기준 원소 선정
		int pivot = arr[left];
		while(left <= right){
			// 왼쪽 파티션 원소 가운데 오른쪽 파티션으로 옮겨야 하는 원소 탐색
			while(arr[left] < pivot) left++;
			// 오른쪽 파티션 원소 가운데 왼쪽 파티션으로 옮겨야 하는 원소 탐색
			while(arr[right] > pivot) right--;
			
			// 원소들의 자리를 바꾸고 left와 right를 이동
			if(left <= right){
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
}
