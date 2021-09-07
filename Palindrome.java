package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		int num1=786;
		int num2=num1;
		int s=0,r;
		while(num1>0)
		{
			r=num1%10;
			s=(s*10)+r;
			num1=num1/10;
		}
		if(num2==s)
		{
			System.out.println("The number is palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
	}

}
