package revision;

public class ConstOvd {
	int a;
	String name;
	boolean b;
	char c;
	static {
		System.out.println("Static MLSI executing");
	}
	{
		System.out.println("Non staticMLSI executing");
	}
	
	ConstOvd()
	{
		
	}
	ConstOvd(int b,String s)
	{
		a=b;
		name=s;
		System.out.println("Cons d executing");
	}
	ConstOvd(boolean b,int a){
		this.b=b;
		this.a=a;
		System.out.println("Cons c executing");
	}
	ConstOvd(String s,int a,char c){
		name=s;
		this.a=a;
		this.c=c;
	}
	public static void main(String[] args) {
//		ConstOvd c=new ConstOvd();
//		ConstOvd d=new ConstOvd(5,"test");
//		ConstOvd e=new ConstOvd(7,"Bike");
//		System.out.println(c.a);
//		System.out.println(c.name);
//		System.out.println(d.a);
//		System.out.println(d.name);
//		System.out.println(e.a);
//		System.out.println(e.name);
		ConstOvd c=new ConstOvd(false,2);
//		System.out.println(c.b);
//		System.out.println(c.a);
		ConstOvd d=new ConstOvd(2,"Partha");
//		System.out.println(d.name);
	}
}
