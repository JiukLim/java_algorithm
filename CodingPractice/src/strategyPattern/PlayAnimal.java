package strategyPattern;

public class PlayAnimal {
	public static void main(String[] args) {
		Animal tiger = new Tiger();
		
		tiger.display();
		tiger.performCry();
		tiger.performFly();
		
		Animal eagle = new Eagle();
		
		eagle.display();
		eagle.performCry();
		eagle.performFly();
	}
}
