package revision;

import java.util.Scanner;
public class Sumofdigits {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value");
		int givennum=s.nextInt();
		int num=givennum;
		int sum=0;
		int pro=1;
		int rem=0;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+rem;
			pro=pro*rem;
			num=num/10;
		}
		System.out.println("The Sum of digits of entered value is "+sum);
		System.out.println("The Product of digits of entered value is "+pro);
	}

}
