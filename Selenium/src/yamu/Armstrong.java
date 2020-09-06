package yamu;

import java.util.Scanner;

public class Armstrong {
	int number;
	int sum=0;
	int c;
	public void cal()
	{
		Scanner sb = new Scanner(System.in);
		System.out.println("Enter the value of number:");
		number = sb.nextInt();
		c=number;
		while(number>0)
		{
		int r=number%10;
		sum=sum+r*r*r; 
		number=number/10;  
		}
		if(c==sum) 
		{
		 System.out.println("Number is Armstrong: " +sum);
		 }
		else 
		{  
			System.out.println("Number is not Armstrong: " +sum);
		} 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong a = new Armstrong();
		
		a.cal();
		
		
	}

}