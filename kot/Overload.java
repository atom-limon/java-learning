package kot;

public class Overload {
	void test(int a, int b) {
		System.out.println("a:"+a+" b:"+b);
	}
	void test(double a) {
		System.out.println("a:"+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadmethod m1 = new Overloadmethod();
		m1.Test();
		m1.Test(10);
		m1.Test(10,20);
		double result =m1.Test(324.546);
		System.out.println("result is ="+result);
		Overload ob= new Overload();
		ob.test(10);	//automatic type conversion int to double;
		ob.test(20.4);
		ob.test(5,15);
	}

}
