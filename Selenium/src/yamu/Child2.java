package yamu;

public class Child2 extends Assignment7{
	public void m6()
	{
		this.m7(30);
		System.out.println("Child default method");
	}
	public void m7(int a)
	{
		this.m9(10, 20, 30);
		System.out.println("Child 1 parameterized method");
	}
	public void m8(int a, int b)
	{
		System.out.println("Child 2 parameterized method");
	}
	public void m9(int a, int b, int c)
	{
		super.m3(45, 55);
		System.out.println("Child 3 parameterized method");
	}
	public void m10(int a, int b, int c, int d)
	{
		this.m6();
		System.out.println("Child 4 parameterized method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child2 a = new Child2();
		a.m10(50, 60,  70, 80);

	}

}
