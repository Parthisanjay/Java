package practice;

public class B extends A {
	static {
		System.out.println("B class SMLI is executing");
	}
	{
		System.out.println("B class NSMLI is executing");
	}
	B(){
		System.out.println("B class No arg const");
	}
	B(int a,int b){
		System.out.println("B class parametrized method");
	}
}
