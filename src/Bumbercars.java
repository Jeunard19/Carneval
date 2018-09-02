
public class Bumbercars extends Attraction {
	
	String name = "Bumbercars";
	double price = 2.50;
	public void runAttraction() {
		System.out.println("de attractie "+name+" draait"); 
	
	}
	Bumbercars(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
}
