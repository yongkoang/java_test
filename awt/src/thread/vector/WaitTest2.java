package thread.vector;

import java.util.Vector;

class WareHouse {
	private Vector v; //창고 크기
	
	public WareHouse() {
		v = new Vector();
	}
	
	// 창고에 넣는다.
	public synchronized void put(int a) {
		v.add(new Integer(a));
		System.out.println("producer:"+a);		
		
		// 창고 크기 3
		while(v.size()==3) { 
			try {
				wait();
			} catch(InterruptedException e) {}
		}	
		notifyAll(); // 소비자를 깨운다
	}
	
	// 창고에서 가져간다.
	public synchronized void get() {
		
		while(v.size()==0) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		Integer b = (Integer)v.remove(0);
		notifyAll(); //생산자를 깨운다
		System.out.println("consumer:"+b.intValue());
	}	
}

// 생산자
class Producer extends Thread {
	private WareHouse w;
	
	public Producer(WareHouse a) {		
		w=a;
	}
	
	// 10개까지 생산한다.
	public void run() {		
		for(int i =1; i<=10; i++) {
			w.put(i);
		}
	}
}

//소비자
class Consumer extends Thread {
	private WareHouse w;
	
	public Consumer(WareHouse a) {
		w = a;
	}
	
	// 10개까지 소비하기 위해서 창고에서 가져간다
	public void run() {
		for(int i=1; i<=10; i++) {
			w.get();
		}
	}
}

public class WaitTest2 {
	public static void main(String args[]) {
		WareHouse w = new WareHouse();
		Producer p1 = new Producer(w);
		Consumer c1 = new Consumer(w);
		
		p1.start();
		c1.start();
	}
}