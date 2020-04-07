package kot;

public class Cast_conversion {
	public static void main(String args[]) {
		int i =342;
		byte b;
		double d=335.546;
		b=(byte)i;
		System.out.println("i and b ="+i+" "+b);
		i=(int) d;
		System.out.println("i and d ="+i+" "+d);
		b=(byte)d;
		System.out.println("b and d ="+b+" "+d);
		}
}
