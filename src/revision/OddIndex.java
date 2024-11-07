package revision;
import java.util.*;
public class OddIndex {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Size of the Array");
		int size=s.nextInt();
		int a[]=new int[size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
       for(int i=1;i<a.length;i+=2) {
			System.out.println(a[i]);
		}
	}
}
