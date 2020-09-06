package yamu;

public class Assignment {
//Calculate ((((10+2)-2)*2)+2)/2)
	static int a = 2;
	public int add(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is: " + c);
		return c;
	}
	public int sub(int x, int y)
	{
		int z;
		z=x-y;
		System.out.println("Sub result is: " + z);
		return z;
	}
	public int mult(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("Mult result is: " + c);
		return c;
	}
	public void div(int x, int y)
	{
		int z;
		z=x/y;
		System.out.println("Final result is: " + z);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assignment cal = new Assignment();
int sum_result = cal.add(10,a);
int sub_result = cal.sub(sum_result, a);
int mult_result = cal.mult(sub_result, a);
int sum1_result = cal.add(mult_result, a);
cal.div(sum1_result, a);

	}

}
