package yamu;

import java.util.Scanner;

public class StringPalindrome {
	//STRING ASSIGNMENT 1:Whether a string is Palindrome or not?
	public StringPalindrome()
	{
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String reverse = "";
		int l = st.length();
		for(int i=l-1; i>=0; i--)
		{
			reverse = reverse+st.charAt(i);
		}
		System.out.println("Reverse String is " +reverse);
		if(st.equals(reverse))
		{
			System.out.println("String is palindrome ");
		}
		else
		{
			System.out.println("String is not palindrome ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome sp = new StringPalindrome();
	}
}
