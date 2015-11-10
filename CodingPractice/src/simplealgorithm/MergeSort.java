package simplealgorithm;

public class MergeSort {
	
	public static void main(String[] args) {
		int[] arr = {3, 8, 0, 1, 2, 4};
		mergesort(arr, 0, arr.length - 1);
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static void mergesort(int[] array, int low, int high){
		if(low < high){
			int middle = (low + high) / 2;
			mergesort(array, low, middle);
			mergesort(array, middle + 1, high);
			merge(array, low, middle, high);
		}
	}
	
	static void merge(int[] array, int low, int middle, int high){
		int[] helper = new int[array.length];
		
		/* 두 부분을 helper 배열에 복사*/
		for(int i = low;i<=high;i++){
			helper[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = middle + 1;
		int current = low;
		
		/* helper 배열 순회, 왼쪽 절반과 오른쪽 절반을 비교하여 
		 * 작은 원소를 추출하여 원래 배열에 복사해 넣는다.
		 * */
		while(helperLeft <= middle && helperRight <= high){
			if(helper[helperLeft] <= helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
			}else{
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		/* 왼쪽 절반 배열에 남은 원소들을 원래 배열에 복사해 넣음 */
		int remaining = middle - helperLeft;
		for(int i = 0;i<=remaining;i++){
			array[current+i] = helper[helperLeft + i];
		}
	}
}
