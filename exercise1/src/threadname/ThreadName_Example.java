package threadname;

public class ThreadName_Example {

public static void main(String[] args) {
		
		Thread currentThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : "+currentThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("�۾� ������ �̸� : "+threadA.getName());
		threadA.start();

		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : "+threadB.getName());
		threadB.start();
	}
}
