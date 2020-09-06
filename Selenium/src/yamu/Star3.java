package yamu;

public class Star3 {
	public Star3()
	{
		int totalLines = 5; 
		for(int i = 1; i<=totalLines; i++)
		{	
			for(int j =1 ; j<=totalLines-i; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star3 a = new Star3();

	}

}
