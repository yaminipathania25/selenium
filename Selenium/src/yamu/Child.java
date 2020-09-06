package yamu;

public class Child extends Assignment6 {

	public Child()
	{
		this(30);
		System.out.println("Child default constructor");
	}
	public Child(int a)
	{
		this(40, 50, 20);
		System.out.println("Child 1 parameterized constructor");
	}
	public Child(int a, int b)
	{
		System.out.println("Child 2 parameterized constructor");
	}
	public Child(int a, int b, int c)
	{
		super(30, 80);
		System.out.println("Child 3 parameterized constructor");
	}
	public Child(int a, int b, int c, int d)
	{
		this();
		System.out.println("Child 4 parameterized constructor");
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child  a = new Child(40, 50, 60, 70);
		
	}

}
