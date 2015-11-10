package designPattern;

public class Singleton {

	private volatile static Singleton singleton;
	
	public static Singleton getInstance(){
		if(singleton == null){
		}
		return singleton;
	}
	private Singleton(){}
}
