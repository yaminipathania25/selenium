package yamu;

import java.util.Scanner;

public class String3 {
	//STRING ASSIGNMENT 3: My name is Deepak --------- yM eman si kappeD
	public String3()
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
		String result = reverse;
		String[] sa = result.split(" ");
		int lr = sa.length;
		for(int i=lr-1; i>=0; i--)
		{
			System.out.print(sa[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String3 o = new String3();


	}

}
