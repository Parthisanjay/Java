package arrayStringPrograms;
import java.util.Scanner;
public class PosElement {
	static int pos;
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int a[]= {5,7,4,7,1,2,7,7,9,8};
		System.out.println("Enter the Element to find its index");
		int key=s.nextInt();
		indexFind(a,key);
	}
	public static void indexFind(int a[],int key) {
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==key) {
				pos=pos*10+i;
				flag=true;	
			}
		}
		if(flag) {
			System.out.println("Position of given element is "+pos);
		}
		else {
			System.out.println("Given Element not present");
		}
	}

}
