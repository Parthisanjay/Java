package revision;
import java.util.Scanner;
public class Reverse {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value");
		int givennum=s.nextInt();
		int num=givennum;
		int rev=0;
		int rem=0;
		int count=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			count++;
		}
		System.out.println(rev);
		System.out.println("The count of entered value is "+count);
	}

}
