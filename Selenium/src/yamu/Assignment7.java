package yamu;

public class Assignment7 {
	public void m1()
	{
		this.m5(1, 2, 3, 4);
		System.out.println("Parent default method");
	}
	public void m2(int a)
	{
		this.m1();
		System.out.println("Parent 1 parameterized method");
	}
	public void m3(int a, int b)
	{
		this.m4(45, 55, 65);
		System.out.println("Parent 2 parameterized method");
	}
	public void m4(int a, int b, int c)
	{
		this.m2(88);
		System.out.println("Parent 3 parameterized method");
	}
	public void m5(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 parameterized method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
