package handCoding;

public class Test {
	// sort
	// mergesort
	public static void mergesort(int[] arr, int left, int right){
		if(left < right){
			int mid = (left + right) / 2;
			mergesort(arr, left, mid);
			mergesort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}
	public static void merge(int[] arr, int low, int mid, int high){
		// helper배열에 현재 병합 할 메서드들을 복사해놔
		int[] helper = new int[arr.length];
		for(int i = low;i<=high;i++){
			helper[i] = arr[i];
		}
		// 두 개의 배열에서 왼쪽 배열 첫 번째, 오른쪽 배열 첫 번째 
		int helperleft = low;
		int helperright = mid + 1;
		int current = low;
		
		// 두 수를 완전히 arr에 몰아 넣기 전에
		while(helperleft <= mid && helperright <= high){
			// helper배열의 크기를 비교하여 작은 것을 넣는다. arr에 
			if(helper[helperleft] <= helper[helperright]){
				arr[current] = helper[helperleft];
				helperleft++;
			}
			else{
				arr[current] = helper[helperright];
				helperright++;
			}
			current++;
		}
		// 남아있는 수들을 
		int remaining = mid - helperleft;
		for(int i = 0;i<=remaining;i++){
			arr[current + i] = helper[helperleft + i];
		}
	}
	// quicksort
	public static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void quicksort(int[] arr, int left, int right){
		int index = partition(arr, left, right);
		
		if(left < index - 1){
			quicksort(arr, left, index - 1);
			quicksort(arr, index, right);
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
	
	public static void print(int[] arr){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static int binarysearch(int[] arr, int left, int right, int target){
		int mid = (left + right) / 2;
		if(target < arr[mid]){
			return binarysearch(arr, left, mid - 1, target);
		}
		else if(target > arr[mid]){
			return binarysearch(arr, mid + 1, right, target);
		}
		else{
			return mid;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		print(arr);
		// mergesort(arr, 0, 4);
		quicksort(arr, 0, 4);
		print(arr);
		System.out.println(binarysearch(arr, 0, 4, 2) + "번 째 인덱스");
		System.out.println(binarysearch(arr, 0, 4, 1) + "번 째 인덱스");
		System.out.println(binarysearch(arr, 0, 4, 3) + "번 째 인덱스");
		System.out.println(binarysearch(arr, 0, 4, 4) + "번 째 인덱스");
		System.out.println(binarysearch(arr, 0, 4, 5) + "번 째 인덱스");
		
	}

}
