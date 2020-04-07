package kot;

public class Test {
	int len , wide, high;
	Test(int l, int w, int h){	//constructor creating by passing parameter;
		len=l;
		wide=w;
		high=h;
	}	//instance variable hiding section;
	int square(int len, int wide) { 	//using pareameter list same name as instance variable;
		this.len=len;	//this refrance as name are same with instance variable;
		this.wide=wide;
		return this.len*this.wide;
	}
	int volume() {
		return len*wide*high;
	}
	public static void main(String args[]) {
		Box b1= new Box();
		b1.height=10;
		System.out.println("height="+b1.height);
		Test box1= new Test(10,5,9);	//constructor calling using parameter;
		System.out.println("volume is ="+box1.volume());
		Test box2=new Test(4,5,6);
		System.out.println("volume is="+box2.volume());
		System.out.println("square is ="+box2.square(10, 10));
		
	}
}
