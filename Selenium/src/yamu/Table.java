package yamu;

import java.util.Scanner;

public class Table {

	int a, s;
	public void cal()
	{
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the value:");
		a=c.nextInt();
		System.out.println("Table of number: " + a);
		for(int i=1; i<=10; i++)
		{ 
			s = a*i;
			System.out.println(s);
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table d=new Table();
		d.cal();
	}

}
