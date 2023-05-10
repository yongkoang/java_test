package thread.sync;

class WareHouse {
	private int data=0;
	
	public void get() {
		System.out.println("consumer:"+data);
	}
	
	public void put(int d) {
		data = d;
		System.out.println("producer:"+data);
	}
}

class Producer extends Thread {
	private WareHouse b;
	
	public Producer(WareHouse w) {		
		b=w;
	}
	
	public void run() {
		int data;
		for(int i =0; i<10; i++) {
			data=(int)(Math.random()*100+1);
			b.put(data);
			try {				
				sleep((int)(Math.random()*100));
			} catch (InterruptedException e){}
		}
	}
}

class Consumer extends Thread {
	private WareHouse b;
	
	public Consumer(WareHouse w) {
		b = w;
	}
	
	public void run() {
		for(int i=0; i<10; i++) {
			b.get();
			try {
				sleep((int)(Math.random()*100));
			} catch(InterruptedException e) {}
		}
	}
}

public class SyncTest1 {
	public static void main(String args[]) {
		WareHouse w = new WareHouse();
		Producer p1 = new Producer(w);
		Consumer c1 = new Consumer(w);
		
		p1.start();
		c1.start();
	}
}