package arrayStringPrograms;
import java.util.Scanner;
public class Position {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {10,20,30,2,40,50};
		System.out.println("Enter the Element");
		int key=s.nextInt();
		int pos=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(key==a[i]) {
				pos=i;
				flag=true;
			}
		}
		if(flag) {
			System.out.println("Position of the given Element "+pos);
		}
		else {
			System.out.println("The Given element is not present in the array");
		}
	}

}
