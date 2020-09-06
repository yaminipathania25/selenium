package yamu;

public class Swaping {
	int a = 10;
	int b = 20;
	public void swap()
	{
		System.out.println("Value of A: "+a);
		System.out.println("Value of B: "+b);
		b = b - a;
		a = b + a;
		System.out.println("Value of A after swaping: "+a);
		System.out.println("Value of B after swaping: "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swaping a = new Swaping();
		a.swap();

	}

}
