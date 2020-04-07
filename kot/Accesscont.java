package kot;
class Stack{
	private int[] stck=new int[10];
	private int tos;
	Stack() {		//constructor to set index to -1;
		tos=-1;
	}
	void push(int i) {		//member method to push values to stack;
		if(tos==9)
			System.out.println("stack is full");
		else
			stck[++tos]=i;
	}
	int pop() {		//pops values of stack;
		if(tos<0) {
			System.out.println("stack overflow");
			return 0;
		}
		else
			return stck[tos--];
	}
	int ret(int i) {		// pops a specific value from the stack;
		if(i>9) {
			System.out.println("data overflowed");
			return 0000;
		}
		else
			return stck[i];
	}
}
public class Accesscont {
	public static void main(String args[]) {
		Stack ob=new Stack();
		for(int i=0;i<10;i++)	ob.push(i);		//pushing value to stack through method ;
		//ob.stck[3]=10; can not be set as stck is private;
		for(int i=0;i<10;i++)	System.out.println(ob.pop());
		System.out.println("Accessing any value of an stack:");
		System.out.println(ob.ret(10));	//accessing value of a stack;
		//System.out.println(ob.stck[3]); cant be done as private;
	}
}
