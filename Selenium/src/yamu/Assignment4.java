package yamu;

public class Assignment4 {

	public Assignment4()
	{
		this(30,40,50,30);
		System.out.println("This is default consturctor");
	}
	public Assignment4(int a)
	{  
		this();
		System.out.println("This is 1 parameterized consturctor");
	}
	public Assignment4(int a, int b)
	{
		this(10, 30, 40);
		System.out.println("This is 2 parameterized consturctor");
	}
	public Assignment4(int a, int b, int c)
	{ 
		this(4);
		System.out.println("This is 3 parameterized consturctor");
	}
	public Assignment4(int a, int b, int c, int d)
	{ 
		System.out.println("This is 4 parameterized consturctor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment4 abc = new Assignment4(20,30);
	}

}
