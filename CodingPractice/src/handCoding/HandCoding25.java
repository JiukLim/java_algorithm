package handCoding;

public class HandCoding25 {
	public static class Singleton {
		private volatile static Singleton instance;
		private Singleton(){
		}
		public static Singleton getInstance(){
			if(instance == null){
				synchronized (Singleton.class) {
					instance = new Singleton();
				}
			}
			return instance;
		}
	}
	public static void main(String[] args){
		Singleton object1 = Singleton.getInstance();
		Singleton object2 = Singleton.getInstance();
		Singleton object3 = Singleton.getInstance();
		Singleton object4 = Singleton.getInstance();
	}
}
