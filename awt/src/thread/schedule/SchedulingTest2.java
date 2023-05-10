package thread.schedule;

public class SchedulingTest2 {
	public static void main(String[] args) {
		Thread[] t = new RunThread[2];
		t[0] = new RunThread("Orange");
		t[1] = new RunThread("Apple");
		t[0].start();
		t[1].start();
		t[0].setPriority(t[0].MAX_PRIORITY);
	}
}
