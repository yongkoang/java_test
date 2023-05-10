package thread.schedule;

class RunThread extends Thread {
	public RunThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i=1; i<=300000; i++) {
			if(i%50000 == 0) {
				System.out.println("Thread ["+getName()+"]:" + i);
			}
		}
	}
}

public class SchedulingTest1 {
	public static void main(String args[]) {
		Thread[] t = new RunThread[2];
		t[0] = new RunThread("Orange");
		t[1] = new RunThread("Apple");
		t[0].start();
		t[1].start();
	}
}
