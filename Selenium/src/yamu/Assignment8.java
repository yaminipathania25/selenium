package yamu;

import java.util.Scanner;

public class Assignment8 {
//((((x1+x2)-x3)+x4)*x5)/x6)
	public int sum(int x1, int x2)
	{
		int a;
		a = x1 + x2;
		System.out.println("Sum of x1+x2 :" + a);
		return a;
	}
	public int sub(int x1, int x2)
	{
		int b;
		b = x1 - x2;
		System.out.println("Sub of x1 - x2 :" + b);
		return b;
	}
	public int mult(int x1, int x2)
	{
		int c;
		c = x1 * x2;
		System.out.println("Mult of x1 * x2 :" + c);
		return c;
	}
	public void div(int x1, int x2)
	{
		int d;
		d = x1 / x2;
		System.out.println("Final result :" + d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment8 s= new Assignment8();
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1 = sb.nextInt();
		System.out.println("Enter the value of x2");
		int x2 = sb.nextInt();
		int s1 = s.sum(x1, x2);
		System.out.println("Enter the value of x3");
		int x3 = sb.nextInt();
		int s2 = s.sub(s1, x3);
		System.out.println("Enter the value of x4");
		int x4 = sb.nextInt();
		int s3 = s.sum(s2, x4);
		System.out.println("Enter the value of x5");
		int x5 = sb.nextInt();
		int s4 = s.mult(s3, x5);
		System.out.println("Enter the value of x6");
		int x6 = sb.nextInt();
	    s.div(s4, x6);

	}

}