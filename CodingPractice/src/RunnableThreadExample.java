
public class RunnableThreadExample implements Runnable{
	public int count = 0;
	@Override
	public void run() {
		System.out.println("RunnableThread starting.");
		try {
			while(count < 5){
				Thread.sleep(500);
				count++;
			}
		} catch (InterruptedException exc) {
			System.out.println("RunnableThread interrupted");
		}
		System.out.println("RunnableThread terminating");
	}

	public static void main(String[] args) {
		RunnableThreadExample instance = new RunnableThreadExample();
		Thread thread = new Thread(instance);
		thread.start();
		
		/* 쓰레드 개수가 5가 될 때까지 (천천히) 기다린다.*/
		while(instance.count != 5){
			try {
				thread.sleep(250);
			} catch (InterruptedException exc) {
				exc.printStackTrace();
			}
		}
		
	}

}
