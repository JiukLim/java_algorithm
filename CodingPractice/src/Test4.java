public class Test4 {

	int a;
	public Test4(int a){
		this.a = a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 t = new Test4(1);
		int i = 5;
		changeInt(i);
		System.out.println(i);		// 5
		changeTest(t);
		System.out.println(t.a);	// 1
		changeTestInt(t);
		System.out.println(t.a);	// 10
	}
	public static void changeInt(int a){
		a = 10;
	}
	public static void changeTest(Test4 t){
		t = new Test4(100);
	}
	public static void changeTestInt(Test4 t){
		t.a = 10;
	}
}
