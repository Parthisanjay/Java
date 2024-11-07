package revision;
import java.util.*;
public class Drivercar1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		Car1 c=new Car1("BMW","Black");
		System.out.println("Enter the Engine cc");
		int engcc=s.nextInt();
		System.out.println("Enter the Engine no");
		int engno=s.nextInt();
		c.addEngine(new Engine(engcc,engno));
		System.out.println(c.e.engcc);
		System.out.println(c.e.engno);
		c.removeEngine();
		System.out.println(c.e.engcc);
		System.out.println(c.e.engno);		
	}
}
