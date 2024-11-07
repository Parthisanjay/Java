package numberPrograms;
import java.util.Scanner;
public class Factors {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		int a=s.nextInt();
		System.out.println("The Factors of the Entered number is ");
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
