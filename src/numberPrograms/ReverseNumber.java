package numberPrograms;
import java.util.Scanner;
public class ReverseNumber {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int num=s.nextInt();
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("The Reverse order of the Entered number is\n"+rev);
	}
}
