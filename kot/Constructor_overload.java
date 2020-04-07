package kot;

public class Constructor_overload {
	double high,wide,length;
	Constructor_overload(){		//overloaded constructors;
		high=-1;
		wide=-1;
		length=-1;
	}
	Constructor_overload(double w, double h, double l){
		high= h;
		wide=w;
		length=l;
	}
	Constructor_overload(double k){
		high=wide=length=k;
	}
	double volume() {		//method without parameter;
		return high*wide*length;
	}
	public static void main(String args[]) {
		double volume;
		Constructor_overload ob1=new Constructor_overload(10.5, 20, 3.5);
		Constructor_overload ob2=new Constructor_overload();
		Constructor_overload ob3=new Constructor_overload(5);	//here is a automatic type precestion;
		volume=ob1.volume();
		System.out.println("volume is="+volume);
		volume=ob2.volume();
		System.out.println("volume is ="+volume);
		volume=ob3.volume();
		System.out.println("cube is of ="+volume);
	}
}
