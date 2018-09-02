
public class Hauntedhouse extends Attraction{
	Hauntedhouse(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	String name = "Hauntedhouse";
	double price = 3.20;
	public void runAttraction() {
		System.out.println("de attractie "+name+" draait");
	
	}
}
