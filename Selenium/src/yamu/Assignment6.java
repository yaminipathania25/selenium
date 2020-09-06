package yamu;

public class Assignment6 {

	public Assignment6()
	{
		this(1, 2, 3, 4);
		System.out.println("Parent default constructor");
	}
	public Assignment6(int a)
	{
		this();
		System.out.println("Parent 1 parameterized constructor");
	}
	public Assignment6(int a, int b)
	{
		this(45, 55, 65);
		System.out.println("Parent 2 parameterized constructor");
	}
	public Assignment6(int a, int b, int c)
	{
		this(88);
		System.out.println("Parent 3 parameterized constructor");
	}
	public Assignment6(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
