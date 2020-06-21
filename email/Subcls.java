package email;

import java.util.Scanner;


public class Subcls {
	private String firstname;
	private String lastname; 
	private String departmentname;
	private String password="";
	private String emailforcompany;
	Subcls(){
		//the power of constructor
		System.out.println("Welcome To Our \"LimonTechIT\"('-')");
		System.out.println("Here i am LIRI with you to provide you a company E-mail \nLet's get started");
		System.out.print("Enter your first name=");
		Scanner sc=new Scanner(System.in);
		firstname=sc.next();
		//System.out.println();
		System.out.print("Enter your last name=");
		lastname=sc.next();
		//System.out.println();
		System.out.print("Please kindly enter your department in our company:");
		departmentname=sc.next();
		System.out.println();
		System.out.println("So mr."+firstname+" I have generated an email for you!!");
		emailforcompany=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+departmentname.substring(0, 4).toLowerCase()+"."+"LTIT"+"."+"com";
		System.out.println("That's-:"+emailforcompany);
		System.out.println("I am recommanding you a password:"+passwordgenrator()+"\n(you can change when you want in info section)");
		showinfo();
	}
	//password generator method
	private String passwordgenrator() {
		char [] ch=new char[8];
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@#$%&*";
		for(int i=0;i<8;i++) {
			int random=(int)(Math.random()*str.length());
			password+=str.charAt(random);
		}
		return this.password;
	}
	//showing info
	private void showinfo() {
		System.out.println("\nIN-FORMATION");
		System.out.println("Here You All Set:-");
		System.out.println();
		System.out.println("E-mail:-"+emailforcompany);
		System.out.println("Pass:-"+password);
		System.out.println();
		System.out.println("1: to change password;\n2: to save and exit;");
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.print("Choise:");
		int n=sc.nextInt();
		if(n==1) {
			changepassword();
			showinfo();
		}
		else {
			System.out.println("\"WELCOME TO A NEW JOURNEY\"");
			System.out.println("_-You are good to explore-_");
		}
	}
	private String changepassword() {	//password set method;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter old password:");	//checking to old password
		while(!this.password.equals(sc.next())) {	//backtracking password change and checking process
			System.out.print("you have entered wrong password!\nenter again:");
		}
		String st;
		System.out.print("Enter New password:");	//getting new password
		this.password=sc.next();
		while(password.length()<8) {	//backtracking password change
			System.out.println("Password cant be less than 8 Characters");
			System.out.println("Enter again:");
			this.password=sc.next();
		}
		return this.password;
	}
	
}
