package revision;
import java.util.Scanner;
public class PrimeRange {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the start num");
		int start=s.nextInt();
		System.out.println("Enter the End num");
		int end=s.nextInt();
		
		for(int i=start;i<=end;i++) {
			int count=0;
			if(i==0 || i==1) {
				System.out.println("Neither prime nor composite :"+i);
			}
			else {
				for(int j=2;j<=i;j++) {
					if(i%j==0) {
						count++;
					}
				}
			if(count==1) {
				System.out.println("Prime :"+i);
			}
		}
	}		
 }
}
