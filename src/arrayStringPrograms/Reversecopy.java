package arrayStringPrograms;
import java.util.Arrays;
import java.util.Scanner;
public class Reversecopy {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	int a[]= {10,20,30,40,50};
	int b[]=new int[a.length];
	for(int i=a.length-1,j=0;i>=0;i--,j++)
	{
		b[j]=a[i];
	}
	System.out.println(Arrays.toString(b));
}
}
