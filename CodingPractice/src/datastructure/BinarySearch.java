package datastructure;

public class BinarySearch {

	public static int binarysearch(int[] arr, int target){
		int low = 0, high = arr.length - 1;
		while(low <= high){
			int mid = (low + high) / 2;
			if(target < arr[mid]){
				high = mid - 1;
			}
			else if(target > arr[mid]){
				low = mid + 1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	public static int binarysearch_recursive(int[] arr, int target, int low, int high){
		if(low > high) return -1;
		int mid = (low + high) / 2;
		if(target < arr[mid]){
			return binarysearch_recursive(arr, target, low, mid - 1);
		}else if(target > arr[mid]){
			return binarysearch_recursive(arr, target, mid + 1, high);
		}else{
			return mid;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(binarysearch(arr, 3));
		System.out.println(binarysearch_recursive(arr, 2, 0, 6));
	}

}
