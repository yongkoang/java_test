class StaticEx2 {	
	public int a = 0;
	public static int b = 0;
}

public class StaticEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx2 s1 = new StaticEx2();
		s1.a = 1;
		s1.b = 1;
		StaticEx2 s2 = new StaticEx2();
		s2.a = 2;
		s2.b = 2;
		
		System.out.println("a="+s1.a);
		System.out.println("b="+s1.b);
	}

}
