package revision;

public class VarshdC extends VarshdB{
	int a=30;
	VarshdC()
	{
		
	}
	public void m2(int a) {
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		VarshdC c=new VarshdC();
		VarshdC d=new VarshdC();
//		System.out.println(c);
//		System.out.println(d);
		d.m2(10);
	}
	
}
