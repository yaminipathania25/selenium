package yamu;

//import java.util.Scanner;

public class Loop2 {
	public Loop2(int k)
	{ 
		int Count=1;
		
		for(int i=1; i<=4; i++)
		{	
			
			for(int j=1 ; j<=i; j++) 
			{
				System.out.print(Count );
				Count++;
			}
			
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop2 a = new Loop2(4);
		
		//a.loop2(1);


	}

}
