package practice;

public class A {
	static {
		System.out.println("A class SMLI is executing");
	}
	{
		System.out.println("A class NSMLI is executing");
	}
	A(){
		System.out.println("A class No arg const");
	}
	A(int a,int b){
		System.out.println("A class parametrized method");
	}
}
