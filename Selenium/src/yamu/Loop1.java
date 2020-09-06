package yamu;

public class Loop1 {
	public Loop1()
	{
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop1 a = new Loop1();

	}

}
