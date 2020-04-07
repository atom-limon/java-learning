package kot;
class Tost{
	void value(int i, int j) {		//declaring a method with primitive type parameter and pass b value;
		i*=2;
		j+=3;
	}
}
class ref{
	int a,b;
	ref(int i,int j){
		a=i;
		b=j;
	}
	void refr(ref obj) {
		obj.a*=2;
		obj.b+=6;
	}
}

public class Call_v_r {
	public static void main(String args[]) {
		Tost obj1=new Tost();	//object under Test class
		int a,b;
		a=b=20;
		System.out.println("a:"+a+" b:"+b+" before method calling");
		obj1.value(a,b);
		System.out.println("a:"+a+" b:"+b+" after method calling");
		//no effect on values pass through a method
		ref obj2= new ref(10,15);
		System.out.println("a:"+obj2.a+" b:"+obj2.b+" before method calling");
		obj2.refr(obj2);//passing object as parameter;
		System.out.println("a:"+obj2.a+" b:"+obj2.b+" before method calling");
		
	}
}
