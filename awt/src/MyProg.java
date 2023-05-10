interface Inter1 {
	int a = 1;	
}

interface Inter2 {
	int b = 2;	
}

interface Inter extends Inter1, Inter2 {
	int c = 3;
}

public class MyProg implements Inter {
	public static void main(String args[]) {
		System.out.println(Inter.a+" "+Inter.b+" "+Inter.c);
	}
}
