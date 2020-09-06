package yamu;

import java.util.Scanner;

public class Factorial {

	public Factorial()
	{
		int a, result=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of a:");
		a=sc.nextInt();
		System.out.println("Factorial of number:");
		for(int i=a; i >=1; i--)
			{
			result=i*result;
			}
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial d=new Factorial();
	}

}
