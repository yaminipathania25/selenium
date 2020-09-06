package yamu;

public class Student {
	int age;
	int roll_no;
	public void display1()
	{
	System.out.println("Welcome to all of you.");
	}
	public void display2()
	{
		System.out.println("Automation is very easy.");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student deepak = new Student();
		deepak.age=25;
		System.out.println("Age = " + deepak.age);
		deepak.roll_no=10;
		System.out.println("Roll No. = " +deepak.roll_no);
		deepak.display1();
		deepak.display2();
	}


}
