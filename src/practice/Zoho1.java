package practice;
import java.util.Scanner;
public class Zoho1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a");
		int a=s.nextInt();
		System.out.println("Enter b");
		int b=s.nextInt();
		//System.out.println(fun(a,b));
		int i;
		for(i=0;i<a;i++) {
			System.out.println(i);
		}
	}
	
	public static int fun(int a,int b) {
		if(b==0) {
			return -1;
		}
		if(a<b) {
			return 0;
		}
		int c=fun(a-b,b)+1;
		return c;
	}
}
