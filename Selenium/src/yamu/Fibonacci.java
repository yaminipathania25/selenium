package yamu;

import java.util.Scanner;

public class Fibonacci {
	
	public int cal(int a, int b)
	{
		int d=10;
		System.out.println("Fibonacci Series of number" );
		if(d==0)
		{
			return a;
		}
		for(int i=0; i<d; i++)
		{
			int c=a+b;
			b=a;
			a=c;
			System.out.println(b);
			
		}
		return b;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a:");
		int a=sc.nextInt();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Value of b:");
		int b=s.nextInt();
		Fibonacci f = new Fibonacci();
		f.cal(a, b);
	
	}

}
