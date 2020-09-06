package yamu;

public class Swap {
	int a = 10;
	int b = 20;
	int c;
	public void swaping()
	{
		System.out.println("Value of A: "+a);
		System.out.println("Value of B: "+b);
		c = a;
		a=b;
		b=c;
		System.out.println("Value of A after swaping: "+a);
		System.out.println("Value of B after swaping: "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap d = new Swap();
		d.swaping();

	}

}
