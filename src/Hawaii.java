
public class Hawaii extends RiskyAttraction {
	int limit =5;
	Hawaii(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	boolean Examinateride(int time){
		
		if((time>=limit)) {
			if((time %limit)==0) {
				return true;
			} else {
				return false;
			}
			
		} else {
			return false;
		}
	}
	String name = "Hawaii";
	double price = 2.50;
	public void runAttraction() {
		System.out.println("de attractie "+name+" draait"); 
	
	}
	
	public double getPrice()  {
		return price;
	}
	
	
}

