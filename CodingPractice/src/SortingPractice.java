
public class SortingPractice {
	public static int arr[] = {3, 1, 5, 2, 4};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();
		// bubble_sort();
		// selection_sort();
		insertion_sort();
		print();
	}
	public static void print(){
		for(int i = 0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void swap(int i, int j){
		int temp  = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void bubble_sort(){
		for(int i = arr.length - 1;i>=0;i--){
			for(int j = 0;j<i;j++){
				if(arr[j] > arr[j + 1]){
					swap(j, j+1);
				}
			}
		}
	}
	public static void selection_sort(){
		for(int i = 0;i<arr.length;i++){
			int minidx = i;
			for(int j = i;j<arr.length;j++){
				if(arr[j] < arr[minidx])
					minidx = j;
			}
			swap(i, minidx);
		}
	}
	public static void insertion_sort(){
		for(int i = 1;i<arr.length;i++){
			for(int j = 0;j<i;j++){
				if(arr[j] > arr[i]){
					swap(j, i);
				}
			}
		}
	}

}
