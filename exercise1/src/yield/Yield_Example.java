package yield;

public class Yield_Example {

	public static void main(String[] args) throws InterruptedException {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		threadA.work=false;
		threadB.work=true;
		
		
		Thread.sleep(1);
		
		threadA.work=true;
		threadB.work=false;
		
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		threadA.stop=true;
		threadB.stop=true;

	}

}
