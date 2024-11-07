package practice;

public class C extends B {
	static {
		System.out.println("C class SMLI is executing");
	}
	{
		System.out.println("C class NSMLI is executing");
	}
	C(){
		System.out.println("C class No arg const");
	}
	C(int a,int b){
		System.out.println("C class parametrized method");
	}
	
	public static void main(String[] args) {
		C c1=new C();
		C c=new C(5,6);
		
	}
}
