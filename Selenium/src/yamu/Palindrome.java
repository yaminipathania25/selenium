package yamu;

public class Palindrome {
	int number=153;   
	int sum=0;
	int old_number=number;
	public void cal()
	{
		while(number>0) 
		{
		int r=number%10;
		//System.out.println("Value of r:" +r);
		sum=sum*10+r; 
		//System.out.println("Value of sum:" +sum);
		number=number/10;  
		//System.out.println("Value of number:" +number);
		}
		if(old_number==sum) 
		{
		 System.out.println("Number is Palindrome: " +sum);
		 }
		else {  
			System.out.println("Number is not Palindrome: " +sum);
		}

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome a = new Palindrome();
		a.cal();

	}

}
