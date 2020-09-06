package yamu;

public class Pyramid {

	public Pyramid()
	{
		int totalLines = 5; 
		for(int i = 1; i<=totalLines; i++)
		{	
			for(int j =1 ; j<=totalLines-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid p = new Pyramid();

	}

}
