package datastructure;

public class Stack {
	public Node top;
	public Object pop(){
		if(top != null){
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}
	public void push(Object item){
		Node t = new Node(item);
		t.next = top;
		top = t;
	}
	
	Object peek(){
		return top.data;
	}
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("1"); s.push("2"); s.push("3");
		for(int i = 0;i<3;i++){
			String current = (String)s.pop();
			System.out.println(current);
		}
	}
}
