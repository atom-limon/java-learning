package kot;
class Test1{
	int a;	//instance variable a;
	Test1(int a){	//constructor to assign instance variables value of objects
		this.a=a;	//using this referance because instance variable and parameter contains same name;
	}
	Test1 incby10() {	//method with return type class;
		Test1 temp=new Test1(a+10);
		return temp;	//returns an object;
	}
}
public class Obj_return {
	public static void main(String args[]) {
		Test1 ob1= new Test1(2);	//ob1.a=2;
		Test1 ob2=ob1.incby10();	//ob1.a=2, temp.a=2+10, ob2.a=temp=12;
		System.out.println("ob1.a="+ob1.a);
		System.out.println("ob2.a="+ob2.a);
		ob2=ob2.incby10();		//ob2.a=12, ob2.a=12+10,ob2=22;
		System.out.println("ob2.a="+ob2.a);
	}
}
