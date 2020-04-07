package kot;
class Test2{
	int a;
	public int  b;
	private int c;
	void access(int i) {
		c=i;
	}
	int back() {
		return c;
	}
}
public class AccessCntrl {
	public static void main(String args[]) {
		Test2 ob= new Test2();
		ob.a=10;
		System.out.println("int a="+ob.a);
		ob.b=20;
		System.out.println("public int b="+ob.b);
		//ob.c=30, could not be done because c is a private member of class Test2 do it can only be accessed
		//through class member,and methods;
		ob.access(30);	//using Test2 class method to access
		System.out.println("private int c="+ob.back());	//using Test2 class method to access
	}
}
