package kot;

public class Box_demo {
	public static void main(String args[]) {
		Box mybox = new Box();		//creating a object under Box class;
		//class name _object name = new class name; 
		int volume;
		mybox.height=10;	//accessing instance variables of Box class;
		mybox.wide = 8;
		mybox.length = 15;
		volume= mybox.height * mybox.wide * mybox.length;
		System.out.println("Volume of my box is ="+volume);
		//each object of a class has own copy of instance variable of own;
		Box mybox2 = new Box();		//another object of Box class;
		mybox2.height=3;	//accessing instance variable of same Box class through another obj;
		mybox2.length=5;
		mybox2.wide=4;
		volume=  mybox2.height * mybox2.wide * mybox2.length;
		System.out.println("Volume of my box2 is ="+volume);
		Box mybox3=new Box();	//autometically calling constructor during object creation;
		System.out.println("volume is="+mybox3.volume());
		
	}
}
