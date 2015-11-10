package strategyPattern;

public class BirdCry implements Cry {
	@Override
	public void cry() {
		System.out.println("짹짹!");
	}
}
