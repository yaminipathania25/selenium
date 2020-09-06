package yamu;

import java.util.Scanner;

public class String2 {
	//STRING ASSIGNMENT 2: My name is Deepak ------------------------- Deepak is name my
	public String2()
	{
	System.out.println("Enter the String: ");
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	String[] sa = st.split(" ");
	int l = sa.length;
	for(int i=l-1; i>=0; i--)
	{
		System.out.print(sa[i]+ " ");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String2 s = new String2();
	}

}
