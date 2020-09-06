package yamu;

import java.util.Scanner;

public class String4 {
	//STRING ASSIGNMENT 5: My name is Deepak ----------------------- occurrence of character e 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch = 'e';
		int counter=0;
		for(int i=0; i<st.length(); i++)
		{
			if(ch==st.charAt(i))
			{
				counter++;
			}
		}
		
		System.out.println("Number of occurence of charater "+ ch + " is " + counter);
		
				}
	

}
