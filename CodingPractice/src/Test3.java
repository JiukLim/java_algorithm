import java.util.Date;


public class Test3 {
	
	class Super{
		String name;
		Date date;
		
		public Super(String name, Date date){
			this.name = name;
			this.date = date;
			System.out.println(name + date);
		}
		public Super(String name){
			this.name = name;
		}
		
		public String toString(){
			return name + date;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
