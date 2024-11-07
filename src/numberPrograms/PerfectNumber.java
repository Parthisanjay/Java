package numberPrograms;
import java.util.Scanner;
public class PerfectNumber {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		String res=partha();
		System.out.println(res);  
	}
	public static String partha()
	{
		System.out.println("Enter the Number");
		int m=s.nextInt();
		int perf=0;
		System.out.println("The Factors of the Entered number is (excluding itself):");
		for(int i=1;i<m;i++)
		{
			if(m%i==0)
			{
				perf=perf+i;
				System.out.println(i);
			}
		}
		if(perf==m)
		{
			return "The Entered number is a Perfect Number";
		}
		else
		{
			return "The Entered number is Not a Perfect Number";
		}
	}
}
