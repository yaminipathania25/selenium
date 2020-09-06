package yamu;

public class Star2 {
	public Star2()
	{
		for(int i = 5; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Star2 a = new Star2();

	}

}
