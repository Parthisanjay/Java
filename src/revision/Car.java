package revision;

public class Car {
	String brand;
	String color;   // Engine e=new Engine(1000,1234);
	Engine e;
	Car(String brand,String color,Engine f){
		this.brand=brand;
		this.color=color;
		this.e=f;
		System.out.println(f);
	}
}
