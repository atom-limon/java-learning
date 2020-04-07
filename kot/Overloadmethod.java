package kot;

public class Overloadmethod {
	void Test() {		//some overloaded methods 
		System.out.println("No parameter");
	}
	void Test(int a) {
		System.out.println("a:"+a);
	}
	void Test(int a, int b) {
		System.out.println("a:"+a+" b:"+b);
	}
	double Test(double a) {
		System.out.println("a:"+a);
		return a*a;
	}
}
