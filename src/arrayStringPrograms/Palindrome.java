package arrayStringPrograms;
import java.util.Scanner;
public class Palindrome {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Word");
		String key=s.next();
		String rev="";
		for(int i=key.length()-1;i>=0;i--) {
			rev=rev+key.charAt(i);
		}
		System.out.println(rev);
		if(key.equalsIgnoreCase(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
