package datastructure;

public class SingleLinkedList {
	
	int value;
	SingleLinkedList next;
	
	public SingleLinkedList(int number) {
		// TODO Auto-generated constructor stub
		this.value = number;
		this.next = null;
	}
	
	public static int showCountForTail(SingleLinkedList head, int count){
		// 어차피 끝을 만날때까지 리스트의 끝을 알수가 없으므로, 
		// 끝까지 가면서 메모리 공간을 하나 더 사용해서 stack에 데이터를 쌓아놓고 있다가 끝을 만나면 그 개수만큼 빼면서 원하는 답을 구할 수 있따. 
		// 시간 복잡도 끝까지 가보는데 걸리는 시간 n , 끝에서부터 원하는 count만큼 빼는데 걸리는 시간 1 => O(n + 1) => O(n)
		SingleLinkedList arr[] = new SingleLinkedList[200];
		int i;
		for(i = 0;head.next != null;head = head.next, i++){
			arr[i] = head;
		}
		return arr[i - count].value;
	}
	
	// 마지막에서 m번째 원소를 찾는 코드	
	public static int FindLastOf(int interval, SingleLinkedList head){
		SingleLinkedList frontHead = new SingleLinkedList(0);
		frontHead = head;
		for(int i = 0;i<interval;i++){
			head = head.next;
		}
		while(head.next != null){
			head = head.next;
			frontHead = frontHead.next;
		}
		return frontHead.value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLinkedList List1 = new SingleLinkedList(1);
		SingleLinkedList List2 = new SingleLinkedList(2); List1.next = List2;
		SingleLinkedList List3 = new SingleLinkedList(3); List2.next = List3;
		SingleLinkedList List4 = new SingleLinkedList(4); List3.next = List4;
		SingleLinkedList List5 = new SingleLinkedList(5); List4.next = List5;
		SingleLinkedList List6 = new SingleLinkedList(6); List5.next = List6;
		
		SingleLinkedList head = new SingleLinkedList(0);
		head = List1;
		System.out.println(SingleLinkedList.FindLastOf(2, head));	// 3
	}
}
