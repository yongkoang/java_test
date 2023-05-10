interface Inter3 {
	void printA();
}

interface Inter4 {
	void printB();
}

public class MyProg2 implements Inter3, Inter4 {
	public static void main(String args[]) {
		MyProg2 mp = new MyProg2();
		mp.printA();
		mp.printB();
	}
	
	@Override
	public void printB() {
		// TODO Auto-generated method stub
		System.out.println("This is interface1.");
	}

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		System.out.println("This is interface2.");
	}

}
