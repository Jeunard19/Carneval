
public class Spin extends RiskyAttraction implements Gamble {
	int limit =5;
	double tax;
	Spin(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	
	boolean Examinateride(int time) throws Exception{
		

		if((time>=limit)) {
			if((time /limit)==(int)(time /limit)) {
				throw new Exception("This attraction is undergoing maintinance, please come back later");
			} else if ((time % limit)==0) {
				throw new Exception("This attraction is undergoing maintinance, please come back later");
			} else {
				return false;
			}
			
		} else {
			return false;
		}
		
	
	}
	String name = "Spin";
	double price = 2.25;
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
