package yamu;

public class Assignment5 {

	public void method1()
	{
		this.method4(70, 67, 78);
		System.out.println("Default method");
	}
	public void method2(int a)
	{
		this.method3(90,  89);
		System.out.println("1 parameterized method");
	}
	public void method3(int a, int b)
	{
		this.method5(70, 80, 90, 78);
		System.out.println("2 parameterized method");
	}
	public void method4(int a, int b, int c)
	{
		System.out.println("3 parameterized method");
	}
	public void method5(int a, int b, int c, int d)
	{
		this.method1();
		System.out.println("4 parameterized method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment5 abc = new Assignment5();
		abc.method2(10);

	}

}
