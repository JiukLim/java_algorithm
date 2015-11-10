package strategyPattern;

public class Eagle extends Animal {
	public Eagle(){
		cry = new BirdCry();
		fly = new FlyWithWings();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("독수리");
	}
	public void performCry(){
		cry.cry();
	}
	public void performFly(){
		fly.fly();
	}
}
