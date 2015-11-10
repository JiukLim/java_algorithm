package simplealgorithm;

public class ListObject {
	public ListObject next;
	public int value;
	public ListObject(int value){
		this.value = value;
	}
	
	// 전체 n개의 연결리스트에서 뒤에서 m번째 원소를 찾는 알고리즘을 구현하라.
	public static int FindLastOf_m(int m, ListObject head){
		// tail를 m만큼 전진시킴
		ListObject tail = head;
		for(int i = 0;i<m;i++){
			tail = tail.next;
		}
		// 이제부터 tail을 같이 하나씩 전진시킴
		while(tail.next != null){
			head = head.next;
			tail = tail.next;
		}
		// 마지막을 만나면 head 를 반환
		return head.value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListObject head;
		ListObject Object1 = new ListObject(1); head = Object1;
		ListObject Object2 = new ListObject(2); Object1.next = Object2;
		ListObject Object3 = new ListObject(3); Object2.next = Object3;
		ListObject Object4 = new ListObject(4); Object3.next = Object4;
		ListObject Object5 = new ListObject(5); Object4.next = Object5;
		
		System.out.println(FindLastOf_m(2, head));
		
	}

}
