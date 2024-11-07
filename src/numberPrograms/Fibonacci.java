package numberPrograms;
import java.util.*;
public class Fibonacci {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{    // 0 1 1 2 3 5 8 13
		System.out.println("Enter the Value");
		int n=s.nextInt();
		int sum=0;
		int v1=0;
		int v2=1;
		System.out.print(v1+" "+v2);
		for(int i=2;i<n;i++)
		{
			sum=v1+v2;
			System.out.print(" "+sum);
			v1=v2;
			v2=sum;
		}
	}
}
