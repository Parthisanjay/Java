package revision;

public class Car1 {
	String brand;
	String color;
	Engine e;
	
	Car1(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}	
	public void addEngine(Engine f) {
		
		e=f;
	}
	
	public void removeEngine() {
		e=null;
	}
}
