package strategyPattern;

public class FlyNoWay implements Fly {
	@Override
	public void fly() {
		System.out.println("날지 못하다");
	}
}
