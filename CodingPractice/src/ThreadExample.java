
public class ThreadExample extends Thread {
	int count = 0;
	
	public void run(){
		System.out.println("Thread starting.");
		try {
			Thread.sleep(500);
			System.out.println("In Thread, count is " + count);
			count++;
		} catch (InterruptedException exc) {
			System.out.println("Thread interrupted");
		}
		System.out.println("Thread terminated");
	}
}
