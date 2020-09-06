package yamu;

import java.util.Scanner;

public class Reversestring {
	//STRING ASSIGNMENT 4: My name is Deepak---------------kapeeD si eman yM
	public void reversestring(String st)
	{
		String reverse = "";
		int l = st.length();
		for(int i=l-1; i>=0; i--)
		{
			reverse = reverse+st.charAt(i);
		}
		System.out.println("Reverse String is = " + reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		Reversestring sp = new Reversestring();
		sp.reversestring(st);
	}

}

/*-----------------------------------------------------------------------------
System.out.println("Enter the String: ");
Scanner sc = new Scanner(System.in);
String st = sc.nextLine();
String[] sa = st.split(" ");
int l = sa.length;
String reverse = "";
for(int i=l-1; i>=0; i--)
{
	String ch=" "+sa[i]+"";
	int cl = ch.length();
	for(int j=cl-1; j>=0; j--)
	{
		reverse = reverse+ch.charAt(j);
	}
	//System.out.println(reverse + " ");
}
System.out.println(reverse);
*/
