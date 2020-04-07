package kot;
class Testy{
	int a,b;
	
Testy(int i, int j){
	a=i;
	b=j;
}
boolean obj(Testy o) {		//passing obj as parameter;
	if(o.a==a && o.b ==b)
		return true;
	else 
		return false;
}
}
public class Object_pareameter {
	public static void main(String args[]) {
		Testy obj1=new Testy(122,22);		//assigning instance variable values through cosntructor parameter;
		Testy obj2=new Testy(122,22);		
		Testy obj3=new Testy(-1,-1);
		System.out.println("obj1==obj2:"+obj1.obj(obj2));	//passing object as a parameter in a method ;
		System.out.println("obj1==obj3:"+obj1.obj(obj3));	//passing object as a parameter in a method;
	}
}
