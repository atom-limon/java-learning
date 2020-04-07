package kot;

public class Box {		//creating a class refers to create a new data type;
	int height;		//3 instance variables of class
	int wide;
	int length;
	void show() {		//creating a method in Box class of void return type;
		System.out.println("Volume is="+(height*wide*length));
	}
	int volume() {		//declaring a method with return type of int;
		int vol=height*wide*length;
		return vol;
	}
	void box_dim(int h, int w, int l) {
		height=h;	//assining values off instance variable using method invocation;
		wide=w;
		length=l;
	}
	Box(){		//creating a constructor and assinging values to instance variable;
		height=10;
		wide=5;
		length=9;
	}
	
}
