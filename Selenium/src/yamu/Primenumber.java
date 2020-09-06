package yamu;

import java.util.Scanner;

public class Primenumber {
	int b = 0;
	int a, n;
	
	public void number()
	{
	 
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the value of number:");
		a= sb.nextInt();
		n=a/2;
		for(int i=2; i<n; i++)
		 {
		 if(a%i==0)
		 {
			 System.out.println("Number is not a prime:" +a);
			 b=1;
			 break;
		 }
	 }
	     if(b==0)
		 {
			 System.out.println("Number is prime:" +a);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Primenumber c=new Primenumber();
		c.number();

	}

}
