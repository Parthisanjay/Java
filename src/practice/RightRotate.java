package practice;
import java.util.Arrays;
import java.util.Scanner;
public class RightRotate {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Enter the Rotation count");
		int rot=s.nextInt();
		for(int i=0;i<rot;i++) {
			int last=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println(Arrays.toString(a));
	}
}
