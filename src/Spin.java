
public class Spin extends RiskyAttraction {
	int limit =5;
	Spin(double price) {
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
	String name = "Spin";
	double price = 2.25;
	public void runAttraction() {
		System.out.println("de attractie "+name+" draait"); 
	
	}
}
