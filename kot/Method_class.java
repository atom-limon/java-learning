package kot;

public class Method_class {
	public static void main(String args[]) {
		Box b1= new Box();	//new object under box class
		b1.height=10;
		b1.wide=5;
		b1.length=15;
		b1.show();		//object calling method
		Box b2= new Box();
		b2.height=15;
		b2.wide=5;
		b2.length=15;
		b2.show();		//object calling method;
		Box b3= new Box();
		b3.height=10;
		b3.wide=5;
		b3.length=15;
		int v=b3.volume();		//assigning method returned value to a variable;
		System.out.println("volume is ="+v);
		Box b4= new Box();
		b4.box_dim(10,5,16);	//method calling by passing parameter;
		System.out.println("volume is = "+b4.volume());
		
	}
}
