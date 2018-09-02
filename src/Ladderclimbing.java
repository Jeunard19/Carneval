
public class Ladderclimbing extends Attraction implements Gamble{
	Ladderclimbing(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	String name = "Ladderclimbing";

	double price = 5.00;
	double tax;

	public void runAttraction() {
		System.out.println("de attractie "+name+" draait"); 
	
	}
	public void setTax() {
		// TODO Auto-generated method stub
		
		 tax=(price *0.30);
	}
	@Override
	public double getTax() {
		// TODO Auto-generated method stub
		
		return tax;
	}
	
	public double getRevenue() {
		setTax();
		return revenue;
	}
	


	
}
