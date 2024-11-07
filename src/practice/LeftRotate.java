package practice;
import java.util.*;
public class LeftRotate {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Enter the Rotation count");
		int rot=s.nextInt();
		for(int i=0;i<rot;i++) {
			int first=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1]=first;
		}
		System.out.println(Arrays.toString(a));
	}
}
