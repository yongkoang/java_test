package thread.wait;

class WareHouse {
	private int data=0;	
	private boolean chk=false;
	public synchronized void get() {
		
		while(chk==false) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		chk=false;
		notifyAll();
		
		System.out.println("consumer:"+data);
	}
	
	public synchronized void put(int d) {
		
		while(chk==true) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}	
		
		data = d;
		System.out.println("producer:"+data);
		
		chk=true;
		notifyAll();
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
				sleep((int)(Math.random()*50));
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

public class WaitTest1 {
	public static void main(String args[]) {
		WareHouse w = new WareHouse();
		Producer p1 = new Producer(w);
		Consumer c1 = new Consumer(w);
		
		p1.start();
		c1.start();
	}
}