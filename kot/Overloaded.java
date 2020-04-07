package kot;

 class Clone {
	double high;
	double wide;
	double length;
	Clone(Clone obj){	//parameter is an object reference;
		high=obj.high;
		wide=obj.wide;
		length=obj.length;
	}
	Clone(double h,double w,double l){
		high=h;
		wide=w;
		length=l;
	}
	Clone(double len){
		high=wide=length=len;
	}
	Clone(){
		high=wide=length=-1;
	}
	double volume() {
		return high*wide*length;
	}
}
 public class Overloaded {
	public static void main(String args[]) {
		Clone myobj1=new Clone(10,5,15);
		Clone myobj2=new Clone();
		Clone myobj3=new Clone(20);
		
		Clone cloneobj=new Clone(myobj1);		//making a copy of myobj1; // here constructor parameter is an object;
		double volume;
		volume=myobj1.volume();
		System.out.println("volume is ="+volume);
		volume=myobj2.volume();
		System.out.println("volume is ="+volume);
		volume=myobj3.volume();
		System.out.println("volume is ="+volume);
		volume=cloneobj.volume();
		System.out.println("volume is ="+volume);
		//cloned and main object are same;
	}
}
